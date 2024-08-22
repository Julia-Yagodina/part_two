package my.test.shop;

//import my.test.config.PersistenceConfig;
import my.test.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ShopRepositoryImpl implements ShopRepository{

    @Override
    public List<Shop> getAll() {
        return List.of();
    }

    @Override
    public void addShop(Shop shop) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(shop);
        tx1.commit();
        session.close();

     }
    }





