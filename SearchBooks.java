package library;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class SearchBooks extends Frame implements ActionListener {
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1,t2;
Button b1,b2,b3;
String s4;
SearchBooks(String h)
{setFont(new Font("serif",Font.BOLD,18));
	s4=h;
   setLayout(null);
   b1=new Button("search");
   b2=new Button("exit");
   b3=new Button("issue");
   l1=new Label("bookid");
   l2=new Label("");
   l3=new Label("");
   l10=new Label("");
   l6=new Label("status");
   l7=new Label("price");
   l8=new Label("");
   l9=new Label("");
   l4=new Label("name :");
   l5=new Label("author :");
   t1=new TextField(30);
   b1.setBounds(100,50,60,20);
   b2.setBounds(100,420,60,20);
   b3.setBounds(170,420,60,20);
   l1.setBounds(100,100,50,20);
   t1.setBounds(160,100,50,20);
   l4.setBounds(100,170,40,20);
   l5.setBounds(100,220,40,20);
   l2.setBounds(150,170,70,20);
   l3.setBounds(150,220,70,20);
   l6.setBounds(100,270,40,20);
   l7.setBounds(100,320,40,20);
   l8.setBounds(150,270,40,20);
   l9.setBounds(150,320,40,20);
   add(l1);add(t1); add(b1); add(b2); add(b3);
   b3.addActionListener(this);
   b1.addActionListener(this);
   b2.addActionListener(this);
   this.addWindowListener(new WindowAdapter()
	{
     public void windowClosing(WindowEvent e)
     {
   	  System.exit(0);
     }
	});
}
public void actionPerformed(ActionEvent e)
{
	PreparedStatement statement =null;
  if(b1==e.getSource())
  {
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
		  statement = con.prepareStatement("select name,author,status,price from books where bookid="+Integer.parseInt(t1.getText())+";"); 
		  ResultSet result=statement.executeQuery();
		  while(result.next())
		  {
			 l2.setText(result.getString(1)); 
			 l3.setText(result.getString(2));
			 l8.setText(result.getString(3));
			 l9.setText(result.getString(4));
			this.add(l2); this.add(l3); this.add(l4); this.add(l5); this.add(l6);
			this.add(l7); this.add(l8); this.add(l9);
		  }
	  }
	  catch (SQLException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  }
  if(b2==e.getSource())
  {
	 
	   	  System.exit(0);
  }
  String s3=null;
  if(b3==e.getSource())
  {
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb"+"?useSSL=false","root","dlndamu");
		  statement = con.prepareStatement("select status from books where bookid="+Integer.parseInt(t1.getText())+";"); 
		  ResultSet result1=statement.executeQuery();
		  while(result1.next())
		  {
			s3=result1.getString(1);
		  }
	  }
	  catch (SQLException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  String s=t1.getText();
	  if(s3.equals("avail"))
	  {
	  int a=Integer.parseInt(s);
	  IssueBook i=new IssueBook(s4,a);
		    i.setSize(1000,1000);
		    i.setVisible(true);
		    i.setTitle("searchBooks");
		    i.setBackground(Color.green);
  }
	  else {
		  this.add(l10);
		  l10.setBounds(150,500,100,30);
		 l10.setText("book not available"); 
	  }
  }
}
}
