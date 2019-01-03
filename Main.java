package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Main extends Frame implements ActionListener {
Button b1,b2;
Label l1;
Main()
{setFont(new Font("serif",Font.BOLD,18));
    setLayout(null);
    l1=new Label("welcome to library management");
    b1=new Button("student");
    b2=new Button("faculty");
    l1.setBounds(400,400,260,50);
    b1.setBounds(400,500,90,30);
    b2.setBounds(500,500,90,30);
    add(l1);
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    addWindowListener(new WindowAdapter()
    		{
    	      public void windowClosing(WindowEvent e)
    	      {
    	    	  System.exit(0);
    	      }
    		});
}
 public void actionPerformed(ActionEvent e)
 {
	 if(b1==e.getSource())
	 {
		 Student s=new Student();
		 s.setSize(1000,1000);
		 s.setTitle("student");
		 s.setVisible(true);
		 s.setBackground(Color.GREEN);
		 
	 }

	 if(b2==e.getSource())
	 {
		 Faculty s=new Faculty();
		 s.setSize(1000,1000);
		 s.setTitle("faculty");
		 s.setVisible(true);
		 s.setBackground(Color.green); 
	 }
 }

}
