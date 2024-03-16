package shop.fh.food.food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.fh.food.customer.CustomerEntity;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.List;
import java.util.Optional;

@Controller
@RestController("foodcontroller")
@RequestMapping("food")
public class FoodController {

    private FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping("title")
    public String getApi(){
        return "hello food";
    }


    @PostMapping("add")
    public void addFood(@RequestBody FoodEntity food){
        foodRepository.save(food);
    }
    @GetMapping("find")
    public Optional<FoodEntity> findFoodById(@RequestParam String id){
        return foodRepository.findById(id);
    }
    @GetMapping("find-by-category")
    public Optional<List<FoodEntity>> findFoodByCategory(@RequestParam FoodCategoryEntity category){
        return foodRepository.findByCategoryEquals(category);
    }
}
