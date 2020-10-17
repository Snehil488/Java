import java.util.*;//import necessary packages
import java.io.*;

 @SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   String name,ph,email;
	   String choice="";
	   FileManager fm = new FileManager();
	   
	  
	   File f=fm.createFile();
	   
	   
	   do{
	   System.out.println("Enter Name");
	   name = sc.nextLine();
	   System.out.println("Enter Phone Number");
	   ph = sc.nextLine();
	   System.out.println("Enter Email");
	   email = sc.nextLine();
	   
	   fm.writeFile(f,name+","+ph+","+email+";");
	 
       System.out.println("Do you want to enter another record(yes/no)");
       choice = sc.nextLine();
	   }while(!choice.equals("no"));
	   
	   System.out.println("Do you want to display all records(yes/no)");
	   choice=sc.nextLine();
	   if(choice.equals("yes")){
	      
	   String[] s = fm.readFile(f);
	     
	   
	   for(String k : s)
	   System.out.println(k);
	  
	       
	   }
	    
	   
	   
	}
    
}