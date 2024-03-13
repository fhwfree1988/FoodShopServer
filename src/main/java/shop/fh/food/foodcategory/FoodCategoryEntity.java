package shop.fh.food.foodcategory;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.ArrayList;
import java.util.List;

public class FoodCategoryEntity {
    @Id
    @JsonIgnore
    private String id;
    private Long objectId;

    String title;
    int code;
    @DocumentReference(lazy=true)
    //@DBRef(lazy = true)
    private FoodCategoryEntity parentId;
    public FoodCategoryEntity(String title, int code,  FoodCategoryEntity parentId) {
        this.title = title;
        this.code = code;
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return String.format(
                "Food[id=%s, code='%s']",
                id, code);
    }
}
