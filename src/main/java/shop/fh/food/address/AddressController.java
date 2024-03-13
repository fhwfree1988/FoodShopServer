package shop.fh.food.address;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.Optional;


@Controller
@RestController("addressController")
@RequestMapping("address")
public class AddressController {

    private AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping("title")
    public String getApi(){
        return "hello address";
    }

    @PostMapping("add")
    public void addAddress(@RequestBody AddressEntity address){
        addressRepository.save(address);
    }
    @GetMapping("find")
    public Optional<AddressEntity> findAddressById(@RequestParam String id){
        return addressRepository.findById(id);
    }

    @GetMapping("find-by-category")
    public Optional<AddressEntity> findAddressByCategory(@RequestParam FoodCategoryEntity category){
        return null;// addressRepository.find(id);
    }
}