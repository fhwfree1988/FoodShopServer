package shop.fh.food.address;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController("addressController")
@RequestMapping("address")
public class AddressController {

    @GetMapping("title")
    public String getApi(){
        return "hello address";
    }
}