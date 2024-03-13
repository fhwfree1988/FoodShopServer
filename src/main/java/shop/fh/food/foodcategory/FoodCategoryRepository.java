package shop.fh.food.foodcategory;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodCategoryRepository extends MongoRepository<FoodCategoryEntity,String> {
}
