package ContactsService.service;

import ContactsService.dao.IContactsDao;
import ContactsService.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Evgeniy
 */
@Service
public class ContactService implements IContactService{
    @Autowired
    private IContactsDao contactDao;


    @Override
    public List<Contact> getContact(String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        List<Contact> resultContactList = new LinkedList<Contact>();
        for (Contact contact : contactDao.list()) {
            Matcher matcher = pattern.matcher(contact.getName());
            if (!matcher.matches()) {
                resultContactList.add(contact);
            }
        }
        return resultContactList;
    }
}
