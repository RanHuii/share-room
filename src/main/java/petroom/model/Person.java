package petroom.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public class Person extends BaseEntity{
    @Column(name = "first_name")
    @NotEmpty
    private String firstName;

    @Column(name = "Last_name")
    @NotEmpty
    private  String lastName;

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }


}
