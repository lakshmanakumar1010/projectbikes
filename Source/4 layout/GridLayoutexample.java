import javax.swing.*;
import java.awt.*;

public class GridLayoutexample extends Frame
{
public static void main(String[] args)
{
JFrame frame=new JFrame("GridLayoutexample");
frame.setLayout(new GridLayout());

//Add components
frame.add(new JButton("Button 1"));
frame.add(new JButton("Button 2"));
frame.add(new JButton("Button 3"));
frame.add(new JButton("Button 4"));

frame.setSize(300,150);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
