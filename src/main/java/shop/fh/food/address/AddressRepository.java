package shop.fh.food.address;

import org.springframework.data.mongodb.repository.MongoRepository;
import shop.fh.food.common.BaseRepository;
import shop.fh.food.customer.CustomerEntity;

public interface AddressRepository extends BaseRepository<AddressEntity, String> {

}
