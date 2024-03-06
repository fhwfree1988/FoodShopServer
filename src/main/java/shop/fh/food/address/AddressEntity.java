package shop.fh.food.address;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class AddressEntity {
    @Id
    Long id ;
    String title;
    String address;
}
