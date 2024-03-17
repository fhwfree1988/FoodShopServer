package shop.fh.food.common;

import org.springframework.data.mongodb.repository.MongoRepository;
import shop.fh.food.customer.CustomerEntity;

public interface BaseRepository<E, TID>  extends MongoRepository<E, TID> {
}
