import java.io.*;
public class FileDemo{
    public static void main(String[] args) throws IOException
    {
        int count=0;
        BufferedReader bf = new BufferedReader(new FileReader("log.txt"));
        String s;
        while((s= bf.readLine())!=null)
        {
            String[] s1 = s.split("\\s");
            for(int i=0;i<s1.length;i++)
            if(s1[i].equalsIgnoreCase("knowledge"))
            count++;
            
        }
        System.out.println(count);
    }
}