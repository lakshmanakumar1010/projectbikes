import javax.swing.*;
import java.awt.*;
 
public class BorderLayoutexample extends Frame
{
public static void main(String[] args)
{
JFrame frame=new JFrame ("BorderLayoutexample");
frame.setLayout(new BorderLayout());
//Add components 
frame.add(new JButton("north"),BorderLayout.NORTH);
frame.add(new JButton("south"),BorderLayout.SOUTH);
frame.add(new JButton("East"),BorderLayout.EAST);
frame.add(new JButton("west"),BorderLayout.WEST);
frame.add(new JButton("center"),BorderLayout.CENTER);
frame.setSize(300,150);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
