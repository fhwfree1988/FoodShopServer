package shop.fh.food.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("customerController")
@RequestMapping("customer")
public class CustomerController {

    @GetMapping("name")
    public String getApi(){
        return "Hello";
    }
}
