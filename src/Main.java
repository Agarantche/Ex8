import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Adam","adam@adammail.com");
        System.out.println(contact1);

        BusinessContact bContact1 = new BusinessContact("Adam","adam@adammail.com","(614-725-295)");
        System.out.println(bContact1);

        ContactCollection contactCollection = new ContactCollection();
        contactCollection.addContact(contact1);
        contactCollection.addContact(bContact1);
        contactCollection.displayContacts();
    }
}

class Contact {

    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name + ", Email: " + email);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class BusinessContact extends Contact {

    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + getName() + ", Email: " + getEmail() + ", Phone: " + phoneNumber);
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}

class ContactCollection {

    private ArrayList<Contact> contacts;

    public ContactCollection() {
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            contact.display();
        }
    }
}
