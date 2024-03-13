package shop.fh.food.address;

import org.springframework.data.mongodb.repository.MongoRepository;
import shop.fh.food.customer.CustomerEntity;

public interface AddressRepository extends MongoRepository<AddressEntity, String> {

}
