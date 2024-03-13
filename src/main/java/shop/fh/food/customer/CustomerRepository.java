package shop.fh.food.customer;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

}
