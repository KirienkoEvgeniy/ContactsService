package ContactsService.dao;

import ContactsService.model.Contact;

import java.util.List;

/**
 * Created by Evgeniy on 26.05.2016.
 */
public interface IContactsDao {
    public List<Contact> list();
}
