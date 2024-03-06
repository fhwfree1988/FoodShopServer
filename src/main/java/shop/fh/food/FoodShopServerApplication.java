package shop.fh.food;

import jakarta.transaction.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import shop.fh.food.customer.CustomerEntity;
import shop.fh.food.customer.CustomerReporsitory;

@SpringBootApplication
@ComponentScan("shop")
@EntityScan("shop")
//@EnableMongoRepositories("shop")
@EnableMongoRepositories
public class FoodShopServerApplication extends SpringBootServletInitializer implements CommandLineRunner {
    @Autowired
    private CustomerReporsitory repository;
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
        repository.deleteAll();

        // save a couple of customers
        repository.save(new CustomerEntity("Alice", "Smith"));
        repository.save(new CustomerEntity("Bob", "Smith"));
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
