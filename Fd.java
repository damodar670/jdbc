package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Fd extends Frame implements ActionListener {
 //Label l1;
 Button b1,b2,b3;
 String s4;
 
 public Fd(String h)
 {  setFont(new Font("serif",Font.BOLD,18));
	 s4=h;
   setLayout(null);
   b1=new Button("SearchBooks");
   b1.setBounds(100,100,70,20);
  
   b2=new Button("ReturnBook");

   b2.setBounds(200,100,70,20);
   add(b1);
   add(b2);

   this.addWindowListener(new WindowAdapter()
	{
     public void windowClosing(WindowEvent e)
     {
   	  System.exit(0);
     }
	});
   b1.addActionListener(this);
   b2.addActionListener(this);
  
 }
 public void actionPerformed(ActionEvent e)
 {
	 if(b1==e.getSource())
	 {
	    SearchBookss s=new SearchBookss(s4);
	    s.setSize(1000,1000);
	    s.setVisible(true);
	    s.setTitle("searchBooks");
	    s.setBackground(Color.green);
	 }
	 if(b2==e.getSource())
	 {
		  ReturnBooks db=new ReturnBooks(s4);
		 db.setSize(1000,1000);
		 db.setTitle("returnBook");
		 db.setVisible(true);
		 db.setBackground(Color.green);
	 } 
 }
}
