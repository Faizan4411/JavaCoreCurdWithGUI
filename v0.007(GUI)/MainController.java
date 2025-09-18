import java.util.*;
import javax.swing.*;

public class MainController{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		DatabaseManager dbm=new DatabaseManager();
		try{
			do{
				
				String numberStr=JOptionPane.showInputDialog("1 Customer Review\n2 Customer Add\n3 Customer Update\n4 Customer Delete\n5 Exit\n\nEnter Selection:  ");
				int number=Integer.parseInt(numberStr);
				
				//------------------get Customer Review start--------------------------------------------
				if(number==1){
					Vector v=dbm.getCustomerView();
					
					for(int i=0; i<v.size(); i++){
						CustomerBean bean=(CustomerBean)v.elementAt(i);
						JOptionPane.showMessageDialog(null,"Customer Id: "+bean.getCustomerId()+"\nCustomer Name: "+bean.getCustomerName()+"\nGmail: "+bean.getGmail()+"\nContact: "+bean.getContact());
					}
				}
				//------------------get Customer Review End--------------------------------------------
				
				
				//------------------get Customer Insert start--------------------------------------------
				if(number==2){
					
					String insertName=JOptionPane.showInputDialog("Enter Name: ");
					String insertGmail=JOptionPane.showInputDialog("Enter gmail: ");
					String insertContact=JOptionPane.showInputDialog("Enter contact Number: ");
					
					dbm.insertCustomer(insertName,insertGmail,insertContact);
				}
				//------------------get Customer Insert End--------------------------------------------
				
				//------------------get Customer Update start--------------------------------------------
				if(number==3){
					String updateCustomerIdStr=JOptionPane.showInputDialog("Enter Update Id: ");
					int	updateCustomerId=Integer.parseInt(updateCustomerIdStr);
					String updateName=JOptionPane.showInputDialog("Enter Name: ");
					String updateGmail=JOptionPane.showInputDialog("Enter gmail: ");
					String updateContact=JOptionPane.showInputDialog("Enter contact Number: ");
				
					dbm.updateCustomer(updateCustomerId,updateName,updateGmail,updateContact);
					
				}
				//------------------get Customer Update End--------------------------------------------
				//------------------get Customer Delete start--------------------------------------------
				if(number==4){
					String deleteCustomerIdStr=JOptionPane.showInputDialog("Enter Update Id: ");
					int	deleteCustomerId=Integer.parseInt(deleteCustomerIdStr);
					
					dbm.deleteCustomer(deleteCustomerId);
				}
				//------------------get Customer Delete End--------------------------------------------
				
				
				if(number==5){break;}
			
			}while(true);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}