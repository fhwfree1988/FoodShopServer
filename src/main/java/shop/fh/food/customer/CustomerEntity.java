package shop.fh.food.customer;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import shop.fh.food.address.AddressEntity;

import java.util.List;

/*@Entity*/
@Document("CUSTOMER")
@Data
//@NoArgsConstructor
public class CustomerEntity {
    @Id
    Long id ;
    String firstName;
    String lastName;
    /*@ElementCollection
    private List<AddressEntity> addresses;*/

    public CustomerEntity() {}

    public CustomerEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
