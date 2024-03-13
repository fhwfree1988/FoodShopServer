package shop.fh.food.food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("foodcontroller")
@RequestMapping("food")
public class FoodController {
    @GetMapping("title")
    public String getApi(){
        return "hello food";
    }
}
