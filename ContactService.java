/***********************
Andre Freitas
CS320
9/21/2024
***********************/

package ContactService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContactService {
    //Crate array to hold contacts
    private ArrayList<Contact> contactList = new ArrayList<>();

    public void displayContactList() {
		for (int i = 0; i < contactList.size(); i++) {
			System.out.println("\t Contact ID: " + contactList.get(i).getContactID());
			System.out.println("\t First Name: " + contactList.get(i).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(i).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(i).getPhone());
			System.out.println("\t Address: " + contactList.get(i).getAddress() + "\n");
        }

    }
    //Adding contact
    public void addContact(String firstName, String lastName, String phone, String address) throws Exception{
        Random rand = new Random();
        int number = rand.nextInt(100000);
        Contact contact = new Contact(firstName, lastName, phone, address, String.valueOf(number));
        contactList.add(contact);
    }

    //Deleting Contact
    public void deleteContact(String contactID){
        contactList.removeIf(contact -> contact.getContactID().equals(contactID));

    }

    //Updating First name
    public void updateFirstName(String newString, String contactID) {
        for(int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getContactID().equals(contactID)){
                contactList.get(i).setFirstName(newString);
                break;
            }

        }

 
    }

    //Updating Last name
    public void updateLastName(String newString, String contactID){
        for(int i = 0; i < contactList.size(); i++){
            if(contactList.get(i).getContactID().equals(contactID)){
                contactList.get(i).setLastName(newString);
                break;
            }

        }
    }

    //Updating Phone Number
    public void updatePhone(String newString, String contactID){
        for(int i = 0; i < contactList.size(); i++){
            if(contactList.get(i).getContactID().equals(contactID)){
                contactList.get(i).setNumber(newString);
                break;
            }

        }
    }

    //Updating Address
    public void updateAddress(String newString, String contactID) {
        for (int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).getContactID().equals(contactID)){
                contactList.get(i).setAddress(newString);
                break;
            }

        }
    }

    public Contact getContact(String contactId){
        return contactList.stream().filter(contact -> contact.getContactID().equals(contactId)).findAny().orElse(null);
    }

    public List<Contact> getContactList(){
        return contactList;
    }

}
