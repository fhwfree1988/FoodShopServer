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
@NoArgsConstructor
public class CustomerEntity {
    @Id
    Long id ;
    String name;
    @ElementCollection
    private List<AddressEntity> addresses;
}
