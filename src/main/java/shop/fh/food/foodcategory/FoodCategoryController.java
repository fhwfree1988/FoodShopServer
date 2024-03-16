package shop.fh.food.foodcategory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.fh.food.food.FoodEntity;

import java.util.List;
import java.util.Optional;

@Controller
@RestController("foodcategorycontroller")
@RequestMapping("food-category")
public class FoodCategoryController {

    private FoodCategoryRepository foodCategoryRepository;

    public FoodCategoryController(FoodCategoryRepository foodCategoryRepository) {
        this.foodCategoryRepository = foodCategoryRepository;
    }

    @GetMapping("title")
    public String getApi(){
        return "hello food-category";
    }

    @PostMapping("add")
    public void addFoodCategory(@RequestBody FoodCategoryEntity food){
        foodCategoryRepository.save(food);
    }
    @GetMapping("find")
    public Optional<FoodCategoryEntity> findFoodCategoryById(@RequestParam String id){
        return foodCategoryRepository.findById(id);
    }
}
