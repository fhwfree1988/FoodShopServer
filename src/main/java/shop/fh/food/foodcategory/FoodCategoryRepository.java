package shop.fh.food.foodcategory;

import org.springframework.data.mongodb.repository.MongoRepository;
import shop.fh.food.common.BaseRepository;

public interface FoodCategoryRepository extends BaseRepository<FoodCategoryEntity,String> {
}
