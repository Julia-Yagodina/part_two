package my.test.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {
    private final ShopServiceImpl service = new ShopServiceImpl();

    public ShopController() {

    }

    @GetMapping("/shops")
    public List<Shop> getShops() {
        return service.getAllShops();
    }

        @PostMapping("/shop")
        public Shop addShop(@RequestBody Shop shop) {
        return service.addShop(shop);
        }
}
