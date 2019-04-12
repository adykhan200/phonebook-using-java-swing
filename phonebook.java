import java.awt.BorderLayout;
import java.awt.Container;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.io.*;
class phonebook implements ActionListener
{
StringBuffer sb11=new StringBuffer();
String abcd;
String sep11;
int aa11;
JButton b1=new JButton("Addition");
JButton b2=new JButton("Updation");
JButton b3=new JButton("Deletion");
JButton b4=new JButton("Report");

JFrame f=new JFrame();
JFrame f1=new JFrame();
JPanel pl=new JPanel(null);
JPanel pl1=new JPanel(null);
JTextField tf1=new JTextField();
JTextField tf2=new JTextField();
JTextField tf3=new JTextField();
JTextField tf4=new JTextField();
JLabel l1=new JLabel("first name");
JLabel l2=new JLabel("Middle name");
JLabel l3=new JLabel("Last name");
JLabel l4=new JLabel("Phone Number");

phonebook()
{
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

//Container contentPane = f.getContentPane();
//contentPane.add(pl,BorderLayout.CENTER);
//
//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Container contentPane1 = f1.getContentPane();
//contentPane1.add(pl,BorderLayout.CENTER);
//f1.setLocationRelativeTo(f);
//    JList list = new JList(labels);
//    JScrollPane scrollPane = new JScrollPane(list);

//    Container contentPane = f.getContentPane();
//    contentPane.add(scrollPane, BorderLayout.CENTER);
//f1.setSize(200,200);
//f.setVisible(true);
//f1.setVisible(true);
//f.setLayout(new FlowLayout());
//f.validate();
//f1.validate();

b1.setBounds(220,100,100,30);
b2.setBounds(220,130,100,30);
b3.setBounds(220,160,100,30);
b4.setBounds(220,190,100,30);

l1.setBounds(20,100,80,20);
l2.setBounds(20,130,80,20);
l3.setBounds(20,160,80,20);
l4.setBounds(20,190,90,20);

tf1.setBounds(120,100,80,20);
tf2.setBounds(120,130,80,20);
tf3.setBounds(120,160,80,20);
tf4.setBounds(120,190,80,20);
pl.add(l1);
pl.add(l2);
pl.add(l3);
pl.add(l4);
pl.add(tf1);
pl.add(tf2);
pl.add(tf3);
pl.add(tf4);
pl.add(b1);
pl.add(b2);
pl.add(b3);
pl.add(b4);
pl.setBackground(Color.red);
f.add(pl);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(800,400);
//f.setBackground(Color.red);
f.setVisible(true);
//f1.setLayout(new FlowLayout());//set layout
/*pl1.add(l1);
pl1.add(l2);
pl1.add(l3);
pl1.add(l4);
pl1.add(tf1);
pl1.add(tf2);
pl1.add(tf3);
pl1.add(tf4);
pl1.add(b1);
pl1.add(b2);
pl1.add(b3);
pl1.add(b4);
pl1.setBackground(Color.green);
//f1.add(pl1);*/
ImageIcon img = new ImageIcon("./java.jpg");
f1.setIconImage(img.getImage());
f1.setLocationRelativeTo(f);
f1.getContentPane().setBackground(Color.green);
f1.setSize(800,400);
f1.setVisible(true);


try
 {
 BufferedReader br=new BufferedReader(new FileReader("C:\\program files\\Java\\jdk1.7.0\\bin\\adnantel.txt"));
 String line11;  
 sep11=System.getProperty("line.separator");

 while((line11=br.readLine())!=null)
 {
  sb11.append(line11);
  sb11.append(sep11);
 }
 }catch(IOException e1)
 {
 } 
}
public void actionPerformed(ActionEvent e)
{
 String str=e.getActionCommand();
 if(str.equals("Addition")){
     abcd=tf1.getText().toString().trim()+","+tf2.getText().toString().trim()+","+tf3.getText().toString().trim()+","+tf4.getText().toString().trim();
     abcd=("START,"+abcd+",END");
     for(char ch11 : abcd.toCharArray())
     {
       if(((int)ch11>=65 && (int)ch11<=90) || ((int)ch11>=97 && (int)ch11<=122)) 
        sb11.append((char)((int)ch11+100));
       else if((int)ch11>=48 && (int)ch11<=57)
            sb11.append((char)((int)ch11-25)); 
         else
            sb11.append(ch11);
     }
      System.out.println(abcd);
      System.out.println(sb11); 
      //sb11.append("start"+abcd+"end");
     sb11.append(sep11);
     try
    {
       BufferedWriter brw=new BufferedWriter(new FileWriter("C:\\program files\\Java\\jdk1.7.0\\bin\\adnantel.txt"));
       brw.write(sb11.toString());
       brw.close();
     }catch(IOException e1)
    {
    }
 }else if(str.equals("Updation")){
          String zz11[]=null;
          String abcd11;
          String xyz11=null;
          String xyz22=null;
          abcd11="START,"+tf1.getText().toString().trim();
          for(char ch11 : abcd11.toCharArray())
         {
            if(((int)ch11>=65 && (int)ch11<=90) || ((int)ch11>=97 && (int)ch11<=122)) 
                 xyz11=xyz11+((char)((int)ch11+100));
            else if((int)ch11>=48 && (int)ch11<=57)
                     xyz11=xyz11+((char)((int)ch11-25)); 
            else
                     xyz11=xyz11+(ch11);
         }
          xyz11=xyz11.substring(5,(xyz11.length())); 
          System.out.println("-------------------->"+xyz11); 
          int aa11=sb11.indexOf(xyz11);
          System.out.println(aa11);
          if(aa11>=0)
          {         
           //zz11=sb11.substring(aa11,(aa11+20)).split(","); 
          for(char ch11 : sb11.substring(aa11,sb11.length()).toCharArray())
         {
            if(((int)ch11>=165 && (int)ch11<=190) || ((int)ch11>=197 && (int)ch11<=222)) 
                 xyz22=xyz22+((char)((int)ch11-100));
            else if((int)ch11>=(48-25) && (int)ch11<=(57-25))
                     xyz22=xyz22+((char)((int)ch11+25)); 
            else
                     xyz22=xyz22+(ch11);
          }
          xyz22=xyz22.substring(3,(xyz22.length()));
          System.out.println(xyz22);
           
           zz11=xyz22.split(",");   
          //zz11=aa11.split(","); 
          tf2.setText(zz11[2]);
          tf3.setText(zz11[3]);
          tf4.setText(zz11[4].toString());
          } 
          System.out.println("updation");
 }else if(str.equals("Deletion")){
  System.out.println("deletion");
 }else if(str.equals("Report")){
          String zz11[]=null;
          String abcd11;
          String xyz11=null;
          String xyz22=null;
          abcd11="START,"+tf1.getText().toString().trim();
          for(char ch11 : abcd11.toCharArray())
         {
            if(((int)ch11>=65 && (int)ch11<=90) || ((int)ch11>=97 && (int)ch11<=122)) 
                 xyz11=xyz11+((char)((int)ch11+100));
            else if((int)ch11>=48 && (int)ch11<=57)
                     xyz11=xyz11+((char)((int)ch11-25)); 
            else
                     xyz11=xyz11+(ch11);
         }
          xyz11=xyz11.substring(5,(xyz11.length())); 
          System.out.println("-------------------->"+xyz11); 
          int aa11=sb11.indexOf(xyz11);
          System.out.println(aa11);
          if(aa11>=0)
          {         
           //zz11=sb11.substring(aa11,(aa11+20)).split(","); 
          for(char ch11 : sb11.substring(aa11,sb11.length()).toCharArray())
         {
            if(((int)ch11>=165 && (int)ch11<=190) || ((int)ch11>=197 && (int)ch11<=222)) 
                 xyz22=xyz22+((char)((int)ch11-100));
            else if((int)ch11>=(48-25) && (int)ch11<=(57-25))
                     xyz22=xyz22+((char)((int)ch11+25)); 
            else
                     xyz22=xyz22+(ch11);
          }
          xyz22=xyz22.substring(3,(xyz22.length()));
          System.out.println(xyz22);
           
           zz11=xyz22.split(",");   
          //zz11=aa11.split(","); 
          tf2.setText(zz11[2]);
          tf3.setText(zz11[3]);
          tf4.setText(zz11[4].toString());
          } 
         //System.out.println(zz11);   
 }
 /**/
 
  //int a=tf1.getText().toString().length();
 //tf2.setText(tf1.getText().toString());

}
public static void main(String args[])
{
new phonebook();
}
}