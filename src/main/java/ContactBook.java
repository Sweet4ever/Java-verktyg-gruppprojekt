import java.util.ArrayList;

public class ContactBook {

    private int findContact (Contact contact){
        return this.myContacts.indexOf(contact);
    }
    @overload
    private int findContact(String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(Contact.getContact().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}