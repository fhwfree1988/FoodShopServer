package shop.fh.food.foodcategory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("foodcategorycontroller")
@RequestMapping("food-category")
public class FoodCategoryController {

    @GetMapping("title")
    public String getApi(){
        return "hello food-category";
    }
}
