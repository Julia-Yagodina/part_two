package my.test.shop;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository  {
    List<Shop> getAll();
    void addShop(Shop shop);
}
