package shop.fh.food.address;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.fh.food.common.BaseController;
import shop.fh.food.foodcategory.FoodCategoryEntity;

import java.util.Optional;



@RestController("addressController")
@RequestMapping("address")
public class AddressController extends BaseController {

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

}