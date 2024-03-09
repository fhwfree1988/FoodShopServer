package shop.fh.food.customer;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;
import shop.fh.food.address.AddressEntity;

import java.util.ArrayList;
import java.util.List;

@Document("CUSTOMER")
@Data
@NoArgsConstructor
public class CustomerEntity {
    @Id
    //@Field("id")
    @JsonIgnore
    private String id;
    private Long objectId;

    String firstName;
    String lastName;

    @DocumentReference(lazy=true)
    //@DBRef(lazy = true)
    private List<AddressEntity> addresses;

    public CustomerEntity(String firstName, String lastName,AddressEntity address) {
        this.firstName = firstName;
        this.lastName = lastName;

        if(address != null && !address.isEmpty()){
            addresses = new ArrayList<>();
            addresses.add(address);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
