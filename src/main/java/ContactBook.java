import java.util.ArrayList;

public class ContactBook {
    private ArrayList<Contact> myContacts;

    public ContactBook(){
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(String contactFirstName){
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getFirstName().equals(contactFirstName)) {
                return i;
            }
        }
        return -1;
    }

    public  void listContacts(){
        System.out.println("Kontaktlista: ");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i + 1) + ".	Förnamn: " +
                    this.myContacts.get(i).getFirstName() + "\n\t Efternamn: " +
                    this.myContacts.get(i).getLastName() + "\n\t E-mail: " +
                    this.myContacts.get(i).getEmail());
        }
    }
}