package shop.fh.food.food;

import org.springframework.data.mongodb.repository.MongoRepository;
import shop.fh.food.common.BaseRepository;
import shop.fh.food.customer.CustomerEntity;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends BaseRepository<FoodEntity, String> {
    //Optional<List<FoodEntity>> findByCategoryEquals(FoodCategoryEntity category);
}
