package pro.sky.onlineshop.service;

import org.springframework.stereotype.Service;
import pro.sky.onlineshop.interfaces.ConsumerService;
import pro.sky.onlineshop.model.ShoppingCart;

import java.util.Set;
import java.util.TreeSet;

@Service

public class ConsumerServiceImpl implements ConsumerService {

    private final ShoppingCart shoppingCart;

    public ConsumerServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    @Override
    public Set<Long> add(Set<Long> idItems) {
        if (shoppingCart.getItems() == null) {
            shoppingCart.setItems(idItems);
        } else
            shoppingCart.addItems(idItems);
        return idItems;
    }

    @Override
    public Set<Long> getOrder() {
        return shoppingCart.getItems() != null ? shoppingCart.getItems() : new TreeSet<>();
    }

}
