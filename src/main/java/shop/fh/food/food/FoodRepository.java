package shop.fh.food.food;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRepository extends MongoRepository<FoodEntity, String> {
}
