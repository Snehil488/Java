import java.io.*;
public class FileDemo
{
    public static void main(String[] args) throws IOException
    {
        int i;
        FileInputStream in = new FileInputStream("log.txt");
        while((i=in.read())!=-1)
        {
            System.out.print((char)i);
        }
        in.close();
    }
}