import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class student extends Frame implements ActionListener
{
String msg;
Button b1=new Button("save");
Label l11=new Label("student details",Label.CENTER);
Label l1=new Label("NAME",Label.LEFT);
Label l2=new Label("AGE",Label.LEFT);
Label l3=new Label("GENDER",Label.LEFT);
Label l4=new Label("ADDRESS",Label.LEFT);
Label l5=new Label("COURSE",Label.LEFT) ;
Label l6=new Label("SEM",Label.LEFT);
Label l7=new Label("",Label.RIGHT);
TextField t1=new TextField ();
Choice c1=new Choice();
CheckboxGroup cbg=new CheckboxGroup();
Checkbox ck1=new Checkbox("male",false,cbg);
Checkbox ck2=new Checkbox("female",false,cbg);
TextArea t2=new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
Choice course= new Choice();
Choice sem= new Choice();
Choice age= new Choice();
public student()
{
addWindowListener(new myWindowAdapter());
setBackground(Color.red);
setForeground(Color.black);
setLayout(null);
add(l11);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(t1);
add(t2);
add(ck1);
add(ck2);
add(course);
add(sem);
add(age);
add(b1);
b1.addActionListener(this);
add(b1);
course.add("BSc cs");
course.add("MSc cs");
course.add("Bsc IT");
course.add("BCA");
course.add("MCA");
sem.add("1");
sem.add("2");
sem.add("3");
sem.add("4");
sem.add("5");
sem.add("6");
age.add("17");
age.add("18");
age.add("19");
age.add("20");
age.add("21");
l1.setBounds(25,65,90,20);
l2.setBounds(25,90,90,20);
l3.setBounds(25,120,90,20);
l4.setBounds(25,185,90,20);
l5.setBounds(25,260,90,20);
l6.setBounds(25,290,90,20);
l7.setBounds(25,260,90,20);
l11.setBounds(10,40,280,20);
t1.setBounds(120,65,170,20);
t2.setBounds(120,185,170,20);
ck1.setBounds(120,120,50,20);
ck2.setBounds(170,120,60,20);
course.setBounds(120,260,100,20);
sem.setBounds(120,290,50,20);
age.setBounds(120,90,50,20);
b1.setBounds(120,350,50,30);
}
public void paint(Graphics g)
{
g.drawString(msg,200,450);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("save"))
{
msg="Thanks For Your Updates....!";
setForeground(Color.blue);
}
}
public static void main(String args[])
{
student stu = new student();
stu.setSize(new Dimension(500,500));
stu.setTitle("STUDENTS REGISTRATION FORM");
stu.setVisible(true);
}
}
class myWindowAdapter extends WindowAdapter
{
public void WindowClosing(WindowEvent we)
{
System.exit(0);
}
}