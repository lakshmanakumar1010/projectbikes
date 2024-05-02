import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CardLayoutexample extends Frame
{
public static void main(String[] args)
{
JFrame frame=new JFrame("CardLayoutexample");
CardLayout cardLayout=new CardLayout();
JPanel cardPanel=new JPanel(cardLayout);

//Add components
cardPanel.add(new JButton("Card1"),"Card1");
cardPanel.add(new JButton("Card2"),"Card2");
cardPanel.add(new JButton("Card3"),"Card3");
JButton nextButton=new JButton("Next Card");
nextButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
cardLayout.next(cardPanel);
}
});
frame.add(cardPanel,BorderLayout.CENTER);
frame.add(nextButton,BorderLayout.SOUTH);
frame.setSize(300,150);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            frame.setVisible(true);
}
}


