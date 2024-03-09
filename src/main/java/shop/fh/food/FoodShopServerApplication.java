package shop.fh.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import shop.fh.food.address.AddressEntity;
import shop.fh.food.address.AddressRepository;
import shop.fh.food.customer.CustomerEntity;
import shop.fh.food.customer.CustomerRepository;

@SpringBootApplication
@ComponentScan("shop")
@EntityScan("shop")
//@EnableMongoRepositories("shop")
@EnableMongoRepositories
public class FoodShopServerApplication extends SpringBootServletInitializer implements CommandLineRunner {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;
    public static void main(String[] args) {
        SpringApplication.run(FoodShopServerApplication.class, args);
    }
    //added for war
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FoodShopServerApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        customerRepository.deleteAll();
        addressRepository .deleteAll();

        AddressEntity add1 = addressRepository.save(new AddressEntity("address one","St. 73"));
        AddressEntity add2 = addressRepository.save(new AddressEntity("address one","St. 88"));
        /*AddressEntity add1 = new AddressEntity("1","address one","St. 73");
        AddressEntity add2 = new AddressEntity("2","address one","St. 88");*/

        // save a couple of customers
        customerRepository.save(new CustomerEntity("Alice", "Smith",add1));
        customerRepository.save(new CustomerEntity("Bob", "Smith",add2));
    }
    /*private void persistTestData(EntityManagerFactory entityManagerFactory, Editor editor)
            throws Exception {
        TransactionManager transactionManager =
                com.arjuna.ats.jta.TransactionManager.transactionManager();
        transactionManager.begin();
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.persist(editor);
        entityManager.close();
        transactionManager.commit();
    }*/
}
