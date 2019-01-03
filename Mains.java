package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Mains extends Frame implements ActionListener {
Button b1,b2;
Label l1,l2,l3,l4;
TextField t1,t2,t3;
Mains()
{setFont(new Font("serif",Font.BOLD,18));
    setLayout(null);
    l1=new Label("welcome,login in to continue");
    b1=new Button("Login");
    b2=new Button("Exit");
    l2=new Label("userid");
    l3=new Label("password");
    l4=new Label("");
    t1=new TextField(30);
    t2=new TextField(30);
    t2.setEchoChar('*');
    l1.setBounds(200,150,250,50);
     l2.setBounds(200,260,70,30);
     l3.setBounds(200,320,70,30);
     t1.setBounds(290,260,100,30);
     t2.setBounds(290,320,100,30);
     b1.setBounds(200,400,50,30);
     b2.setBounds(260,400,50,30);
    add(l1);add(l2); add(l3); add(t1); add(t2);
    add(b1); add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    addWindowListener(new WindowAdapter()
    		{
    	      public void windowClosing(WindowEvent e)
    	      {
    	    	  System.exit(0);
    	      }
    		});}
 public void actionPerformed(ActionEvent e)
 {
	
		 if(b1==e.getSource())
		 {String s,s1;
			 s=t1.getText();
			 s1=t2.getText();
			 if(s.equals(""))
			 {
				 l4.setBounds(200,480,180,50);
					add(l4);
					l4.setText("enter valid username");
					
			 } 
			 if((s.equals("root"))&&(s1.equals("root")))
			 {
				l4.setBounds(200,480,180,50);
				add(l4);
				l4.setText("login successful");
				 Main c=new Main();
				 c.setVisible(true);
				 c.setSize(1000,1000);
				 c.setTitle("verify member");
				 c.setBackground(Color.green);
			 }
			 else
			 {
				 l4.setBounds(200,480,180,50);
					add(l4);
					l4.setText("Invalid login");
			 }
		 }
	 
	 if(b2==e.getSource())
	 {
		 System.exit(0);
	 }
	 
 }
 public static void main(String args[])
 {
	 Mains c=new Mains();
	 c.setVisible(true);
	 c.setSize(1000,1000);
	 c.setTitle("library");
	// c.setBackground(Color.green);
 }
}

