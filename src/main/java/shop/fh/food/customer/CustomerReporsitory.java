package shop.fh.food.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface CustomerReporsitory extends MongoRepository<CustomerEntity, Long> {

}
