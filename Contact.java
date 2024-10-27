/***********************
Andre Freitas
CS320
9/21/2024
***********************/
package ContactService;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String firstName, String lastName, String phone, String address, String contactId) throws Exception {
        
        //Generating Contact ID
        this.contactID = contactId;

        //Creating first name
        if (firstName == null || firstName.isEmpty()){

            throw new Exception("First name cannot be blank");
        }

        else if (firstName.length() > 10){
            this.firstName = firstName.substring(0, 10);
        }
        
        else {
            this.firstName = firstName;
        }
        
        //Creating Last name
        if (lastName == null || lastName.isEmpty()){

            throw new Exception("Last name cannot be blank");

        }

        else if (lastName.length() > 10){
            this.lastName = lastName.substring(0, 10);
        }

        else{
            this.lastName = lastName;
        }

        //Creating Phone number
        phone = phone.replace("-", "");
        if (phone.length() > 10 || phone.length() < 10) {

            throw new Exception("Phone Number must be exactly 10 digits");
        }

        else if (phone == null || phone.isEmpty()){

            throw new Exception("Phone Number cannot be blank");
        }
        else{
            this.phone = phone;
        }

        //Creating address
        if(address == null || address.isEmpty()){
            throw new Exception("Address cannot be blank");
        }

        else if (address.length() > 30){
            this.address = address.substring(0, 30);
        }
        else{
            this.address = address;
        }
    }

    //Getters

    public String getContactID(){
        return contactID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

    //Setters

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()){
            System.out.println("First name cannot be blank");
        }
    

        else if (firstName.length() > 10){
            this.firstName = firstName.substring(0, 10);
        }
    
        else {
            this.firstName = firstName;
        }
    }
    public void setLastName(String lastName){
        if (lastName == null || lastName.isEmpty()){
            System.out.println("Last name cannot be blank");

        }

        else if (lastName.length() > 10){
            this.lastName = lastName.substring(0, 10);
        }

        else{
            this.lastName = lastName;
        }
    }

    public void setNumber(String phone){
        if (phone.length() > 10 || phone.length() < 10) {
            System.out.println("Phone Number must be exactly 10 digits");
        }

        else if (phone == null || phone.isEmpty()){
            System.out.println("Phone Number cannot be blank");
        }
        else{
            this.phone = phone;
        }
    }

    public void setAddress(String address){
        if(address == null || address.isEmpty()){
            System.out.println("Address cannot be blank");
        }
        else if (address.length() > 30){
            this.address = address.substring(0, 30);
        }
        else{
            this.address = address;
        }
    }
}