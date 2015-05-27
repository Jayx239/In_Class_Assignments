/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simpleclientusingurlconnection;

/**
 *
 * @author Jason
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class SimpleClientUsingURLConnection
{
public static void main( String args[] ) throws Exception
{
URL u = new URL( "http://ecx.images-amazon.com/images/I/41QaJ2KnGxL._PJStripe-HD-Only-500px,TopLeft,0,0._AC_SY220_.jpg" );  //
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
while ( in.hasNextLine() ){
System.out.println( in.nextLine() );
len++;
}

System.out.println("\n\n\n\nFile " + c.getContentType() + " " + c.getContentLength());
//System.out.prinln(u.getFile().substring(u.getFile().lastIndexOf(".",u.getFile().toString().length())) + " \n" + u.getFile().getBytes().length + " bytes");
}
}
