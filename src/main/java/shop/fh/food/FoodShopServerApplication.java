package shop.fh.food;

import jakarta.transaction.TransactionManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("shop")
@EntityScan("shop")
//@EnableMongoRepositories("shop")
@EnableMongoRepositories
public class FoodShopServerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FoodShopServerApplication.class, args);
    }
    //added for war
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FoodShopServerApplication.class);
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
