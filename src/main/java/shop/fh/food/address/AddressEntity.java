package shop.fh.food.address;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
/*@Entity*/
@Data
@NoArgsConstructor
@Document("Address")
public class AddressEntity {
    @Id
    Long id ;
    String title;
    String address;
}
