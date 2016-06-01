package ContactsService.Test;

import ContactsService.config.MvcConfiguration;
import ContactsService.service.ContactService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * Created by Evgeniy
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = MvcConfiguration.class, loader = AnnotationConfigWebContextLoader.class)
public class TestContactService {
    @Autowired
    private ContactService contactsService;

    @Test
    public void testContactService()
    {
        if(contactsService == null){

        }else {
        Assert.assertEquals(contactsService.getContact("^.*[Aaouei].*$").size(), 211);
    }
    }
}
