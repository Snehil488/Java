import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException,ClassNotFoundException,EOFException
    {
        
        EmployeeUtility e = new EmployeeUtility();
        Employee E = new Employee(101,"Raftaar",52);
        Employee ee = new Employee(102,"Emiway",56);
        ArrayList<Employee> emplist = new ArrayList<>();
        emplist.add(E);
        emplist.add(ee);
        
        File f = new File("sample.txt");
        f.createNewFile();
        e.addEmployee("sample.txt",emplist);
        Employee obj=null;
        
        obj=e.viewEmployeeById("sample.txt",101);
    
        
        System.out.println(obj.getEmployeeId()+","+obj.getName()+","+obj.getAppraisalRating());
        
    }
}