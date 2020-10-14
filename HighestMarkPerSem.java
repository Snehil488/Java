import java.util.*;
import java.util.Arrays;
public class HighestMarkPerSem{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int n = sc.nextInt();
        int max=0;
        
        int[][] arr = new int[n][30];
        int sub[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter no of subjects in "+(i+1)+ " semester:");
        sub[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Marks obtained in semester "+(i+1)+":");
        for(int j=0;j<sub[i];j++)
        {
            arr[i][j] = sc.nextInt();
            if(arr[i][j]<0 || arr[i][j]>100)
            {
                System.out.println("You have entered invalid mark.");
                System.exit(0);
            }
        }
        }
        
     /*   for(int i=0;i<n;i++){
            System.out.println("Maximum mark in "+(i+1)+" semester:");
            for(int j=0;j<sub[i];j++){
               if(arr[i][j+1] > arr[i][j])
               max = arr[i][j+1];
               else
               max = arr[i][j];
            }
            System.out.println(max);
        }  */
        for(int i=0;i<n;i++)
        for(int j=0;j<sub[i];j++)
        for(int k=0;k<sub[i]-j-1;k++){
            if(arr[i][k] > arr[i][k+1]){
                int t=arr[i][k];
                arr[i][k]=arr[i][k+1];
                arr[i][k+1]=t;
            }
        }
        
     /*   for(int i=0;i<n;i++){
        for(int j=0;j<sub[i];j++)
        System.out.print(arr[i][j]+" ");
        System.out.println();
        } */
        
      for(int i=0;i<n;i++)
      System.out.println("Maximum mark in "+(i+1)+" semester:"+arr[i][sub[i]-1]);
        
    }
}