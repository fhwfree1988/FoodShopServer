package shop.fh.food.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import shop.fh.food.common.BaseRepository;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends BaseRepository<CustomerEntity, String> {

}
