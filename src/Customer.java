import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {
	public String[] getCustomer(String last)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from customers where LastName='"+last+"'";
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customers?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				String[] vals=new String[12];
				
				for(int i=0;i<vals.length;i++)
				{
					vals[i]=rs.getString(i+1);
					//System.out.print(vals[i] + "\t");
				}
				System.out.println("");
				return vals;
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
		
		
		
		
	}
	
	public void updateaddress(String last,String street, String city, String state, String zip)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "update customers "+ "set StreetAddress ='"+street+"',City ='"+city+"',State='"+state+"',ZipCode='"+zip
				+ "' where LastName='"+last+"'";
		
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Customers?"
                                + "user=root&password=password");
			stmt = con.createStatement();
			if(!stmt.execute(sql))
			 {
				 
				
				sql= "Select * from customers where LastName='"+last+"'";
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				
				
				ResultSetMetaData col=rs.getMetaData();
				for(int i=1;i<=col.getColumnCount();i++)
				{
					
				//	System.out.print(col.getColumnName(i) + "\t");
				}
				System.out.println();
				System.out.println();
				while(rs.next()){
					
					
					
					for(int i=1;i<=col.getColumnCount();i++)
					{
						
					//	System.out.print(rs.getString(i) + "\t");
					}
					System.out.println();
				}
			 }
		}
			catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		
		
	}

}
	


