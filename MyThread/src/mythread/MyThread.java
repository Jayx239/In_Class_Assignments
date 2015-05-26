/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mythread;

public class MyThread implements Runnable
{
    private String s;
    private static int delay;
    public MyThread( String s ) { this.s = s; }
    public void run()
    {
        try
        {
            for ( int i = 0; i < 5; i++ )
            {
                System.out.println( "sleep delay = " + delay + ", " + s );
                Thread.sleep( delay );
            }
        }
        catch ( InterruptedException e ) {}
    }
    public static void main( String args[] )
    {
        for ( delay = 0; delay <= 1000; delay = delay + 1000 )
        {
            MyThread tt1 = new MyThread( "Cat" );
            MyThread tt2 = new MyThread( "Mouse" );
            Thread t1 = new Thread( tt1 );
            Thread t2 = new Thread( tt2 );
            tt1.run();
            tt2.run();
            t1.start();
            t2.start();
        }
    }
    /*
        Predicted output:
        Cat
        Mouse
        Cat
        Mouse
        Cat
        Mouse
        Cat
        Mouse
        Cat
        Mouse
        
        Cat
        Mouse
        Cat
        Mouse
        Cat
        Mouse
        Cat
        Mouse
        Cat
        Mouse
    
        I predict the I am wrond because there is no guarenteed order that the threads will run in.
    Actual:
        sleep delay = 0, Cat
sleep delay = 0, Cat
sleep delay = 0, Cat
sleep delay = 0, Cat
sleep delay = 0, Cat
sleep delay = 0, Mouse
sleep delay = 0, Mouse
sleep delay = 0, Mouse
sleep delay = 0, Mouse
sleep delay = 0, Mouse
sleep delay = 1000, Cat
sleep delay = 1000, Cat
sleep delay = 1000, Mouse
sleep delay = 1000, Cat
sleep delay = 1000, Cat
sleep delay = 1000, Mouse
sleep delay = 1000, Cat
sleep delay = 1000, Mouse
sleep delay = 1000, Cat
sleep delay = 1000, Cat
sleep delay = 1000, Cat
sleep delay = 1000, Mouse
sleep delay = 1000, Cat
sleep delay = 1000, Cat
sleep delay = 1000, Mouse
sleep delay = 1000, Mouse
sleep delay = 1000, Mouse
sleep delay = 1000, Mouse
sleep delay = 1000, Mouse
sleep delay = 1000, Mouse
sleep delay = 2000, Cat
sleep delay = 2000, Mouse
sleep delay = 2000, Cat
sleep delay = 2000, Mouse
sleep delay = 2000, Mouse
sleep delay = 2000, Cat
sleep delay = 2000, Mouse
sleep delay = 2000, Cat
sleep delay = 2000, Cat
sleep delay = 2000, Mouse
    
    I was completely wrong, I missed the sleep delay = 2000,
    When the run function is called it will run the processes one at a time because it is calling the method directly,
    and when the thread is started it runs the processes on seperate threads which have no guarenteed
    order, so the output is mixed up.
    */
}
