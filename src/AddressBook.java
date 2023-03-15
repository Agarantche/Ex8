import java.util.HashMap;

public class AddressBook {
    private HashMap<String, ContactInformation> contacts;

    public AddressBook() {
        contacts = new HashMap<String, ContactInformation>();
    }

    public void addContact(ContactInformation contact) {
        String name = contact.getName();
        contacts.put(name, contact);
    }

    public String getEmail(String name) {
        ContactInformation contact = contacts.get(name);
        if (contact != null) {
            return contact.getEmail();
        } else {
            return null;
        }
    }
}
