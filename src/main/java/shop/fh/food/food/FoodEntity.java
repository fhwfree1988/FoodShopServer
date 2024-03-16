package shop.fh.food.food;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import shop.fh.food.address.AddressEntity;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodEntity {
    @Id
    @JsonIgnore
    private String id;
    private Long objectId;

    String title;
    int cost;

    @DocumentReference(lazy=true)
    //@DBRef(lazy = true)
    private List<FoodCategoryEntity> categories;

    public FoodEntity(String title, int cost, FoodCategoryEntity category) {
        this.title = title;
        this.cost = cost;

        if(categories != null && !categories.isEmpty()){
            categories = new ArrayList<>();
            categories.add(category);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Food[id=%s, title='%s',cost='%s']",
                id, cost);
    }
}
