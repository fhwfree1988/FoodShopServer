package shop.fh.food.address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@Document("ADDRESS")
public class AddressEntity {
    @Id
    //@Field("id")
    @JsonIgnore
    private String id;
    private Long objectId;

    String title;
    String address;


    public AddressEntity(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public boolean isEmpty() {
        return title == null || title.isEmpty() || address == null || address.isEmpty();
    }
}
