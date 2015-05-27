/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package titleclient;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class TitleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a URL");
        String url = reader.nextLine();
        
        while(url!= "0"){
            
URL u = new URL( url );  //
URLConnection c = u.openConnection();
// set any properties of the connection here
// Should print 200 OK
HttpURLConnection httpC = ( HttpURLConnection ) c;
int code = httpC.getResponseCode();
System.out.println( code + " " + httpC.getResponseMessage() );
if ( code != HttpURLConnection.HTTP_OK )
System.exit( 0 );
InputStream inStream = c.getInputStream();
Scanner in = new Scanner( inStream );

File image = new File("amazon.txt");
PrintWriter pr = new PrintWriter(image);
int len = 0;
String page = "";
while ( in.hasNextLine() ){
    page+=in.nextLine();
}
String Title = page.substring(page.indexOf("<title>")+"<title>".length(),page.indexOf("</title>"));
Title.replace("&amp;", "and");
System.out.println("The Title of this page is: " + Title);
        System.out.println("Enter a URL");
        url = reader.nextLine();
        
        }
    }
    
}
