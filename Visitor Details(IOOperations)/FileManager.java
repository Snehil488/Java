import java.io.*; 
 
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    
    static public File createFile() 
    {
    
    File f1 = new File("visitors.txt");
    try{
    f1.createNewFile();
    }catch(IOException ex){}
    return f1;//change the return type as per the requirement  
    
    }
    
    static public void writeFile(File f, String record)
	{
	    try{
	  FileOutputStream fout = new FileOutputStream(f,true);  
	  char c[] = record.toCharArray();
	  for(int i=0;i<record.length();i++)
	  fout.write(c[i]);
	    }catch(IOException ex){}
	  
	} 
	
	static public String[] readFile(File f)
	{
	    int i=0;
	    String s="";
	    try{
	    FileInputStream fin = new FileInputStream(f);
	    
	    while(i!=-1)
	    {
	        
	       i= fin.read();
	       
	       if(i!=-1)
	       s = s+(char)i;
	       
	    }
}catch(IOException e){}
	    
	    String[] s3 = s.split(";"); 
	    return s3;//change the return type as per the requirement  
	}
 }