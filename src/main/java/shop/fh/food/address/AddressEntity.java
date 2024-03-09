package shop.fh.food.address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
/*@Entity*/
@Data
//@NoArgsConstructor
@Document("ADDRESS")
public class AddressEntity {

    @Id
    @Field("id")
    @JsonIgnore
    private String id;
    @Field("object_id")
    private Long objectId;

    String title;
    String address;

    public AddressEntity() {}

    public AddressEntity(String id, Long objectId, String title, String address) {
        this.id = id;
        this.objectId = objectId;
        this.title = title;
        this.address = address;
    }
}
