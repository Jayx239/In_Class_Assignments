
package squarewindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SquareWindow extends JFrame
{
public static final int WIDTH = 600;
public static final int HEIGHT = 100;
private JPanel panel;
private JTextField numberField;
private JButton button;
private JButton button2;
private JLabel numberLabel;
private final JLabel squareLabel;
private final JLabel squareRtLabel;
public SquareWindow()
{
JLabel numberLabel = new JLabel( "Number: " );
numberField = new JTextField( 10 );
numberField.setText( "0.0" );
squareLabel = new JLabel( "0.0" );
button = new JButton( "Square" );

squareRtLabel = new JLabel( "0.0" );
button2 = new JButton( "Square Root" );
class SquareListener implements ActionListener
{
public void actionPerformed( ActionEvent event )
{
double number = Double.parseDouble( numberField.getText() );
squareLabel.setText( " " + number*number );
}
}
class SquareRtListener implements ActionListener{
    public void actionPerformed( ActionEvent event){
        double number = Double.parseDouble(numberField.getText());
        squareRtLabel.setText(" " + Math.sqrt(number*number));
    }
}
ActionListener listener = new SquareListener();
button.addActionListener(listener);
ActionListener sListener = new SquareRtListener();
button2.addActionListener(sListener);
panel = new JPanel();
panel.add( numberLabel );
panel.add( numberField );
panel.add( button );
panel.add( squareLabel );
panel.add(button2);
panel.add(squareRtLabel);
add( panel );
setSize( WIDTH, HEIGHT );
}
}

