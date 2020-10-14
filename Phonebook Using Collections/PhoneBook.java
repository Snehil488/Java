import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook = new ArrayList<Contact>();
   // public List<Contact> book = new ArrayList<Contact>();
    Contact c;
    
    public void setPhoneBook(List<Contact> phoneBook){
        this.phoneBook=phoneBook;
    }
    public List<Contact> getPhoneBook(){
        return phoneBook;
    }
    
    public void addContact(Contact contactObj){
        phoneBook.add(contactObj);
    }
    
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    
    public Contact viewContactGivenPhone(long phoneNumber){
        for(int i=0;i<phoneBook.size();i++)
        if((long)phoneBook.get(i).getPhoneNumber()==(long)phoneNumber)
        {
            c=phoneBook.get(i);
            return c;
        }
        
        return c;
    }
    
    public boolean removeContact(long phoneNumber){
        for(int i=0;i<phoneBook.size();i++)
        if((long)phoneBook.get(i).getPhoneNumber()==(long)phoneNumber)
        {
            phoneBook.remove(i);
            return true;
        }
        
        return false;
    }
}