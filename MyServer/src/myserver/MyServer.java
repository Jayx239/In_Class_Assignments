/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myserver;
import java.util.*;
import java.io.*;
import java.net.*;
/**
 *
 * @author Jason
 */
public class MyServer
{
    public static void main( String[] args )
    {
	ServerSocket server = null;
	Socket connSocket = null;
    	try
	    {
		server = new ServerSocket( 22222 );
	    }
	catch ( IOException e )
	    {
		System.out.println( "Could not open server socket." );
	    }		
	System.out.println( "Waiting for clients to connect ... " );
	while (true )
	    {
		try
		    {
			try
			    {
				connSocket = server.accept();
				System.out.println( "A new client connected: " + connSocket );
				Scanner in = new Scanner( connSocket.getInputStream() );
				PrintWriter pr = new PrintWriter( connSocket.getOutputStream() );
				boolean done = false;
				while ( in.hasNextLine() && !done )
				    if ( in.nextLine().indexOf( "GET" ) == 0 )
					{
					    System.out.println( "Received a GET request. Responding now." );
					    pr.print( "HTTP/1.1 200 OK\r\n" );
					    pr.print( "Content-Type: text/html\r\n" );
					    pr.print( "Connection: close\r\n" );
					    pr.print( "\r\n" );
					    pr.print( "<html>\r\n" );
					    pr.print( "<p>Hello! My name is Apache. I shall be your web server today! Your IP Address is " + connSocket.getRemoteSocketAddress().toString() + "</p>\r\n" );
					    pr.print( "</html>\r\n" );
					    pr.flush();
					    done = true;
					}
				pr.close();
				in.close();
			    }
			finally
			    {
				connSocket.close();
			    }
		    }
		catch ( Exception e )
		    {
			System.out.println( "Something awful happened!" );
		    }
	    }
    }
}