package shop.fh.food.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.Optional;

@Controller
@CrossOrigin
public class BaseController<E> {
    private BaseRepository repository;
    public void setRepository(BaseRepository repository) {
        this.repository = repository;
    }
    @PostMapping("add")
    public void add(@RequestBody E food){
        repository.save(food);
    }
    @GetMapping("find")
    public Optional<E> findById(@RequestParam String id){
        return repository.findById(id);
    }
}
