package ContactsService.controller;

/**
 * Created by Evgeniy
 */

import ContactsService.model.Contact;
import ContactsService.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactsController {

    @Autowired
    private IContactService contactService;
    @RequestMapping(value = "/contacts")
    public List<Contact> getContact(@RequestParam String regExp){
        return contactService.getContact(regExp);
    }
}
