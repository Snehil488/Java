import java.util.*;//import the necessary packages if needed
     
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
    public static void main (String[] args) {
    
    
        Scanner sc = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        String str,x="";
        System.out.println("Enter Student's Article");
        str = sc.nextLine();
        
        String[] s = str.split("[\\s+,;:.?!]");
        
        for(String p : s)
        x = x+p+' ';
        x = x.toLowerCase();
        
        String[] xx = x.split("\\s+");
        
        for(String p : xx)
        set.add(p);
        
        Iterator<String> it = set.iterator();
        
        System.out.println("Number of words "+xx.length);
        System.out.println("Words with the count");
        while(it.hasNext())
        {
            int c=0;
            String m = it.next();
            for(int i=0;i<xx.length;i++)
            {
                if(m.equals(xx[i]))
                c++;
            }
         System.out.println(m+": "+c);   
        }
        
    }      
        
}