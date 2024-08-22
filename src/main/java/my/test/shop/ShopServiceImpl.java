package my.test.shop;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{
    int num = 0;
    List<Shop> shops = new ArrayList<>();

    private ShopRepositoryImpl repository = new ShopRepositoryImpl();

    public ShopServiceImpl() {
    }

    @Override
    public Shop addShop(Shop shop) {

        repository.addShop(shop);
        return shop;
    }

    @Override
    public List<Shop> getAllShops() {
        Shop shop1 = new Shop();
        shop1.setId(1);
        shop1.setName("пятерочка");
        shop1.setApples(5);
        shop1.setOranges(2);

        Shop shop2 = new Shop();
        shop2.setId(2);
        shop2.setName("магнит");
        shop2.setApples(3);
        shop2.setOranges(4);

        Collections.addAll(shops, shop1, shop2);
        return shops;
    }
}
