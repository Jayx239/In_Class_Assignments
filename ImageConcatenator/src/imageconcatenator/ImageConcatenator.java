/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imageconcatenator;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.*;
import java.util.Scanner;
import javax.imageio.*;
/**
 *
 * @author Jason
 */
public class ImageConcatenator {
    ImageConcatenator(String file1,String file2, String file3,int px, String outFile){
        image1 = this.getImage(file1);
        image2 = this.getImage(file2);
        image3 = this.getImage(file3);
        
        pxW = px;
        outFileName = outFile;
        image1Raster = image1.getRaster();
        int tempdims[][] = {{image1.getWidth(),image1.getHeight()},{image2.getWidth(),image2.getHeight()},{image3.getWidth(),image3.getHeight()}};
        dims = tempdims;
        rgb1 = new int[image1.getWidth()*image1.getHeight()];
        rgb2 = new int[image2.getWidth()*image2.getHeight()];
        rgb3 = new int[image3.getWidth()*image3.getHeight()];
        image1.getRGB(0,0,dims[0][0], dims[0][1],rgb1,0,0);
        image2.getRGB(0,0,tempdims[1][0], tempdims[1][1],rgb2,0,300);
        image3.getRGB(0,0,tempdims[2][0], tempdims[2][1],rgb3,0,300);
        this.getBorderWidth();
        this.getBorderHeight();
        
    }
    // Instance variables
        BufferedImage image1;
        BufferedImage image2;
        BufferedImage image3;
        BufferedImage outImage;
        BufferedImage out;
        //RGB values for writing
        int[] rgb1 = new int[307200];
        int[] rgb2;
        int[] rgb3;
        Raster image1Raster;
        int pxW;
        int borderHeight;
        int borderWidth;
        String outFileName;
        int dims[][] = new int[3][2];
        
        private void getBorderWidth(){
            int bordWidth = 0;  //dims[0][0];
            for(int i = 0; i<3; i++){
                    bordWidth += dims[i][0];
            }
            borderWidth = bordWidth + 4*pxW;
        }
        
        private void getBorderHeight(){
            int maxHeight = dims[0][1];
            for(int i = 1; i<3; i++){
                if(dims[i][1] > maxHeight){
                    maxHeight = dims[i][1];
                }
            }
            borderHeight = maxHeight + 2*pxW;
        }
        public void genBufferedImage(){
            outImage = new BufferedImage(borderWidth,borderHeight,BufferedImage.TYPE_INT_ARGB);
            //outImage = new BufferedImage(image1.getWidth(),image1.getHeight(),BufferedImage.TYPE_INT_ARGB);
            //outImage.setRGB(this.pxW,(this.borderHeight-this.dims[0][1])/2,this.dims[0][0],this.dims[0][1],rgb1,0,0);
            //outImage.setRGB(0,0,image1.getWidth(),image1.getHeight(),rgb1,0,0);
            outImage.createGraphics().drawRect(0,0,borderWidth, borderHeight);
            outImage.createGraphics().drawImage(image1, null, pxW, (borderHeight+2*pxW-dims[0][1])/2);
            outImage.createGraphics().drawImage(image2, null, pxW*2+dims[0][0], (borderHeight+2*pxW-dims[1][1])/2);
            outImage.createGraphics().drawImage(image3, null, pxW*3+dims[0][0]+dims[1][0], (borderHeight+2*pxW-dims[2][1])/2);
            saveImage(outImage,outFileName);
        }
        
        
        public static BufferedImage getImage( String imageFileName )
        {
            BufferedImage inImage = null;
            try
            {
                inImage = ImageIO.read( new File( imageFileName ) );
            }
            catch ( Exception e )
            {
                System.out.println( "Error reading " + imageFileName );
                System.exit( 0 );
            }
            return inImage;
    }
    public static void saveImage( BufferedImage bi, String imageFileName )
    {
        try
        {
            File outImageFile = new File( imageFileName );
            ImageIO.write( bi, "png", outImageFile );
        }
        catch (IOException e)
        {
            System.out.println( "Error saving " + imageFileName );
            System.exit( 0 );
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file1,file2,file3,outFile;
        int borderW;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter image file name 1: ");
        file1 = input.nextLine();
        while(!file1.contains(".png")){
            System.out.print("Error invalid file type\n Enter image file name 1: ");
            file1 = input.nextLine();
        }
        
        System.out.print("Enter image file name 2: ");
        file2 = input.nextLine();
        while(!file2.contains(".png")){
            System.out.print("Error invalid file type\n Enter image file name 2: ");
            file2 = input.nextLine();
        }
        
        System.out.print("Enter image file name 3: ");
        file3 = input.nextLine();
        while(!file3.contains(".png")){
            System.out.print("Error invalid file type\n Enter image file name 3: ");
            file3 = input.nextLine();
        }
        
        System.out.print("Please enter the border width (in pixels): ");
        borderW = input.nextInt();
        input.nextLine();
        System.out.print("Enter a file name for the output image: ");
        outFile = input.nextLine();
        while(!outFile.contains(".png")){
            System.out.print("Error invalid file type\n Enter image file name for the output image: ");
            outFile = input.nextLine();
        }
        ImageConcatenator myImageConcat = new ImageConcatenator(file1,file2,file3,borderW,outFile);
        myImageConcat.genBufferedImage();
        BufferedImage image1 = ImageConcatenator.getImage(file1);
        BufferedImage image2 = ImageConcatenator.getImage(file2);
        BufferedImage image3 = ImageConcatenator.getImage(file3);
        
    }
    
    
}
