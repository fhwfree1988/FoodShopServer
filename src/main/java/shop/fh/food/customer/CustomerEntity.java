package shop.fh.food.customer;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;
import shop.fh.food.address.AddressEntity;

import java.util.List;

/*@Entity*/
@Document("CUSTOMER")
@Data
//@NoArgsConstructor
public class CustomerEntity {
    @Id
    @Field("id")
    @JsonIgnore
    private String id;
    @Field("object_id")
    private Long objectId;

    String firstName;
    String lastName;

    //@OneToMany(fetch = FetchType.LAZY)
    @DocumentReference
    private List<AddressEntity> addresses;

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
