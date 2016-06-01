package ContactsService.dao;
import ContactsService.model.Contact;
import ContactsService.rowmappers.ContactRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Evgeniy
 */
public class ContactsDao implements IContactsDao {
    private JdbcTemplate jdbcTemplate;
    private static final String SQL_SELECT_ALL = "select * from contacts";

    public ContactsDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Contact> list(){

        return jdbcTemplate.query(SQL_SELECT_ALL, new ContactRowMapper());
    }
}
