

import javax.swing.;
import java.awt.;
import java.awt.event.*;
class Myframe extends JFrame implements ActionListener{
JLabel label1,label2,label3,label4,label5;
JTextField t1,t2;
JRadioButton male,female;
JComboBox day,month,year,state;
JTextArea tal1;
JCheckBox terms;
JButton submit;
JLabel msg;
JTextArea screen;
Myframe()
{
setTitle("Regigistation Form");
setSize(1000,750);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE) ;
Container c=getContentPane();
c.setLayout(null);
label1=new JLabel("Name");
label1.setBounds(20,50,100,20);
c.add(label1);
t1=new JTextField();
t1.setBounds(130,50,100,20);
c.add(t1);
label2=new JLabel("Mobile");
label2.setBounds(20,100,100,20);
c.add(label2);
t2=new JTextField();
t2.setBounds(130,100,100,20);
c.add(t2);
label3=new JLabel("Gender");
label3.setBounds(20,150,100,20);
c.add(label3);
male=new JRadioButton("Male");
female=new JRadioButton("Female");
male.setBounds(130,150,80,20);
female.setBounds(220,150,80,20);
male.setSelected(true);
c.add(male);
c.add(female);
ButtonGroup gen=new ButtonGroup();
gen.add(male);
gen.add(female);
label4=new JLabel("Date Of Birth");
label4.setBounds(20,200,100,20);
c.add(label4);
String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
String years[]= {"1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
day=new JComboBox (days);
month=new JComboBox (months);
year=new JComboBox(years);
day.setBounds(130,200,50,20);
month.setBounds(190,200,100,20);
year.setBounds(300,200,75,20);
c.add(day);
c.add(month);
c.add(year);
label5=new JLabel("Adress:");
label5.setBounds(20,250,100,20);
c.add(label5);
tal1=new JTextArea();
tal1.setBounds(130,250,100,20);
c.add(tal1);
terms =new JCheckBox("Please accept T&C");
terms.setBounds(150,350,250,20);
c.add(terms);
submit=new JButton("Submit");
submit.setBounds(170,400,80,20);
c.add(submit);
submit.addActionListener(this);
screen =new JTextArea();
screen.setBounds(500,20,250,200);
c.add(screen);
msg=new JLabel();
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(terms.isSelected())
{
msg.setText("Registation Successful!");
String name=t1.getText();
String mobile = t2.getText();
String gender ="male";
if(female.isSelected())
{
gender="female";
}
String DOB=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
String Adress=tal1.getText();
screen.setText("Name: "+name+"\n"+"Mobile: "+mobile+"\n"+"Gender: "+gender+"\n"+"Date Of Birth :"+DOB+"\n"+"Adress :"+Adress);
}
}
}
public class RegistationForm {
public static void main (String[] args)
{
Myframe frame=new Myframe();
}
}
