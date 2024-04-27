import javax.swing.*;
import java.awt.*;

public class FlowLayoutexample extends Frame
{
public static void main(String[] args)
{
JFrame frame=new JFrame("FlowLayoutexample");
frame.setLayout(new FlowLayout());

//add components
frame.add(new JButton("Button1"));
frame.add(new JButton("Button2"));
frame.add(new JButton("Button3"));

 frame.setSize(300,150);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
}
}