package entities;





import abstracts.Entity;

public class Customer implements Entity {
    private Integer Id;
    private String firstName;
    private String lastName;
   

    public Customer(Integer id, String firstName, String lastName) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
      
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  
}