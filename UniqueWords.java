import java.util.*;//import the necessary packages if needed
     
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,c=0,i=1;
        TreeSet<String> set = new TreeSet<String>();
      
        String x="";
        
        System.out.println("Enter Student's Article");
        String str=sc.nextLine();
        
        String[] s= str.split("[\\s+:,;.?!]");
        
        for(String p:s)
        x = x+p+' ';
        
        x = x.toLowerCase();
        String[] xx= x.split("\\s+");
        
        for(int j=0;j<xx.length;j++)
        set.add(xx[j]);
        
        Iterator<String> it=set.iterator(); 
        c=set.size();
        
        System.out.println("Number of words "+xx.length);
        System.out.println("Number of unique words "+c);
        System.out.println("The words are");
        while(it.hasNext())
        {
        
        System.out.println(i+"."+" "+it.next());
        i+=1;
        }
        
        
        
    }
         
}