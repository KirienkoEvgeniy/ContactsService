package ContactsService.service;

import ContactsService.model.Contact;

import java.util.List;

/**
 * Created by Evgeniy
 */
public interface IContactService {
    public List<Contact> getContact(String regExp);
}
