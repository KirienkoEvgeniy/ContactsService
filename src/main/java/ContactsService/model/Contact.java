package ContactsService.model;

/**
 * Created by Evgeniy
 */
public class Contact {
    private Integer id;
    private String name;

    public Contact(){

    }

    public Contact(Integer id, String name){
        this.id=id;
        this.name=name;

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
