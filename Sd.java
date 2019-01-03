package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Sd extends Frame implements ActionListener {
 //Label l1;
 Button b1,b2,b3,b4;
 String s4;
 Sd(String h)
 {  setFont(new Font("serif",Font.BOLD,18));
	 s4=h;
   setLayout(null);
   b1=new Button("SearchBooks");
   b1.setBounds(100,100,200,20);
  
   b2=new Button("ReturnBook");
/*   b2=new Button("issuebook");
   b3=new Button("displayBookDetails");
   b4=new Button("returnBook");
   b1.setBounds(100,100,70,20);
   b2.setBounds(100,180,70,20);
   b3.setBounds(100,260,70,20);
   b4.setBounds(100,340,70,20); */
   b2.setBounds(340,100,100,20);
   add(b1);
   add(b2);
 /*  add(b2);
   add(b3);
   add(b4); */
   this.addWindowListener(new WindowAdapter()
	{
     public void windowClosing(WindowEvent e)
     {
   	  System.exit(0);
     }
	});
   b1.addActionListener(this);
   b2.addActionListener(this);
   /*
   b3.addActionListener(this);
   b4.addActionListener(this);  */
 }
 public void actionPerformed(ActionEvent e)
 {
	 if(b1==e.getSource())
	 {
	    SearchBooks s=new SearchBooks(s4);
	    s.setSize(1000,1000);
	    s.setVisible(true);
	    s.setTitle("searchBooks");
	    s.setBackground(Color.green);
	 }
	/* if(b2==e.getSource())
	 {
		 IssueBook i=new IssueBook();
		 i.setSize(1000,1000);
		    i.setVisible(true);
		    i.setTitle("searchBooks");
		    i.setBackground(Color.cyan);
		 
	 }
	 if(b3==e.getSource())
	 {
		 displayBookDetails db=new displayBookDetails();
		 db.setSize(1000,1000);
		 db.setTitle("displayBookDetails");
		 db.setVisible(true);
		 db.setBackground(Color.cyan);
	 }
	*/ if(b2==e.getSource())
	 {
		  ReturnBook db=new ReturnBook(s4);
		 db.setSize(1000,1000);
		 db.setTitle("returnBook");
		 db.setVisible(true);
		 db.setBackground(Color.green);
	 } 
 }
}
