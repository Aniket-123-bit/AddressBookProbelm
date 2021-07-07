package AddressBookService;
import AddressBookModel.PersonInfo;

import java.util.ArrayList;
import java.util.Hashtable;


public abstract class AddressBookInterface {
    public abstract Hashtable<String, ArrayList<PersonInfo>> insertContactDetails();

    public abstract void updateContact(String addressBookName, Hashtable<String, ArrayList<PersonInfo>> personInfoDict);

    public abstract boolean findContact(String addressBookName, Hashtable<String, ArrayList<PersonInfo>> personInfoDict);

    public abstract void editContactDetails(String addressBookName, Hashtable<String, ArrayList<PersonInfo>> personInfoDict);

    public abstract void deleteContact(String addressBookName, Hashtable<String, ArrayList<PersonInfo>> personInfoDict);

    public abstract void displayCompanyContacts(Hashtable<String, ArrayList<PersonInfo>> personInfoDict);

    public abstract void searchPerson();
}
