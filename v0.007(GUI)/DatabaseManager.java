import java.util.*;
import java.sql.*;

public class DatabaseManager{
	
	public static Vector getCustomerView()throws Exception{// getCustomerView Start
			
		String query="select * from customer";
		System.out.println(query);
		
		Statement st=null;
		ResultSet result=null;
		Connection con=DBConnection.getConnection();
		try{
			
			st=con.createStatement();
			result=st.executeQuery(query);
			Vector v=new Vector();
			
			while(result.next()){
				CustomerBean bean=new CustomerBean();
				
				bean.setCustomerId(result.getInt("customer_id"));
				bean.setCustomerName(result.getString("customer_name"));
				bean.setGmail(result.getString("gmail"));
				bean.setContact(result.getString("contact"));
				v.addElement(bean);
				
			}
			return v;
		}finally{

		   if(st!=null)st.close();
		   if(result!=null)result.close();
		}
	}// getCustomerView End
	
	
	public static int insertCustomer(String customerName,String gmail,String contact)throws Exception{// InsertCustomer start
			
		String query="insert into customer(customer_name,gmail,contact)values('"+customerName+"', '"+gmail+"','"+contact+"')";
		System.out.println(query);
	   
		Statement st=null;
	   Connection con=DBConnection.getConnection();
		try{
		   st=con.createStatement();
		   int rows=st.executeUpdate(query);
		   
		   return rows;
		}
		finally{
	   
		   if(st!=null)st.close();
		}
	}// InsertCustomer End


	public static int updateCustomer(int customerId,String customerName,String gmail,String contact)throws Exception{
   
		String query="update customer set customer_name= '"+customerName+"', gmail= '"+gmail+"', contact= '"+contact+"'  where customer_id= "+customerId;
		System.out.println(query);
	   
		Statement st=null;
	    Connection con=DBConnection.getConnection();
		try{
			
		   st=con.createStatement();
		   int rows=st.executeUpdate(query);
		   return rows;
		}
		finally{
	   
			if(st!=null){
		   
			   st.close();
			}
		}
	}

	public static int deleteCustomer(int customerId)throws Exception{// deleteCustomer start
    
		String query="delete from customer where customer_id="+customerId;
		System.out.println(query);
		
		Statement st=null;
		Connection con=DBConnection.getConnection();
		try{
		
			st=con.createStatement();
			int rows=st.executeUpdate(query);
			
			return rows;
		}
		finally{// finally start
		
			if(st!=null){
			
				st.close();
			}
		}
	}// deleteCustomer End
		
} 