/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simpleclient;

/**
 *
 * @author Jason
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class SimpleClient
{
public static void main( String args[] ) throws Exception
{
Socket s = new Socket( "drexel.edu", 80 );
InputStream inStream = s.getInputStream();
OutputStream outStream = s.getOutputStream();
Scanner in = new Scanner( inStream );
PrintWriter out = new PrintWriter( outStream );
out.print( "GET /drexelcentral/courses/registration/master-term-schedule/ HTTP/1.1\r\n" );
out.print( "Host: drexel.edu\r\n" );
out.print( "Connection: close\r\n" );
out.print( "\r\n" );
out.flush();
while ( in.hasNextLine() )
System.out.println( in.nextLine() );
s.close();
}
}

