import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        PhoneBook p=new PhoneBook();
        
        do{
            System.out.println("Menu");
            System.out.println("1.Add Contact");
            System.out.println("2.Display all contacts");
            System.out.println("3.Search contact by phone");
            System.out.println("4.Remove contact");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            n=sc.nextInt();
            sc.nextLine();
            
            if(n==1){
                System.out.println("Add a Contact:");
                System.out.println("Enter the First Name:");
                String Name=sc.nextLine();
                System.out.println("Enter the Last Name:");
                String Lname=sc.nextLine();
                System.out.println("Enter the Phone No:");
                long ph=sc.nextLong();
                sc.nextLine();
                System.out.println("Enter the Email:");
                String mail=sc.nextLine();
                
                Contact c=new Contact(Name,Lname,ph,mail);
                p.addContact(c);
                
            }
            else if(n==2){
                List<Contact> list=p.viewAllContacts();
                for(int i=0;i<list.size();i++)
                {
                    System.out.println("The contacts in the List are:");
                    System.out.println("First Name: "+list.get(i).getFirstName());
                    System.out.println("Last Name: "+list.get(i).getLastName());
                    System.out.println("Phone No.: "+list.get(i).getPhoneNumber());
                    System.out.println("Email: "+list.get(i).getEmailId());
                }
            }
            else if(n==3){
                System.out.println("Enter the Phone number to search contact:");
                long num=sc.nextLong();
                Contact cc=p.viewContactGivenPhone(num);
                System.out.println("The contact is:");
                System.out.println("First Name: "+cc.getFirstName());
                System.out.println("Last Name: "+cc.getLastName());
                System.out.println("Phone No.: "+cc.getPhoneNumber());
                System.out.println("Email: "+cc.getEmailId());
            }
            else if(n==4){
                System.out.println("Enter the Phone number to remove:");
                long nn=sc.nextLong();
                System.out.println("Do you want to remove the contact(Y/N):");
                char ch=sc.next().charAt(0);
                if(ch=='Y')
                {
                    if(p.removeContact(nn))
                    System.out.println("The contact is successfully deleted.");
                }
            }
            
        }while(n!=5);
    }
}