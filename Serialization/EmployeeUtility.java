import java.io.*;
import java.util.*;
public class EmployeeUtility
{
    
    public boolean addEmployee(String fileName,ArrayList<Employee> employeelist) 
    {
        try{
        FileOutputStream fout = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        
        //for(Employee e:employeelist)
        out.writeObject(employeelist);
       
       // out.flush();
        
        out.close();
        fout.close();
    
        }catch(IOException ad){}
        return true;
    }
    
    public Employee viewEmployeeById(String fileName,int employeeId)
    {
        try{
        FileInputStream fin = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fin);
       // }catch(IOException ex){}
        ArrayList<Employee> list = new ArrayList<>();
       
     /*  try{
        while(true)
        {
        Employee emp = (Employee)in.readObject();
        list.add(emp);
        }
       }catch(EOFException a){} */
       try {
           
           list = (ArrayList) in.readObject();
       } catch(IOException io) {
       }
       catch(ClassNotFoundException cn){
           
       }
        
        
        for(int i=0;i<list.size();i++)
        if(list.get(i).getEmployeeId()==employeeId)
        return list.get(i);
        }catch(IOException ex){}
        
        
        return null;
        
    }
}