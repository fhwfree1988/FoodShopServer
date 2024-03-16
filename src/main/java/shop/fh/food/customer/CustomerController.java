package shop.fh.food.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.fh.food.address.AddressEntity;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.List;
import java.util.Optional;

@Controller
@RestController("customerController")
@RequestMapping("customer")
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("name")
    public String getApi(){
        return "hello customer";
    }

    @PostMapping("add")
    public void addCustomer(@RequestBody CustomerEntity customer){
        customerRepository.save(customer);
    }
    @GetMapping("find")
    public Optional<CustomerEntity> findCustomerById(@RequestParam String id){
        return customerRepository.findById(id);
    }


}
