package pro.sky.onlineshop.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope
public class ShoppingCart {
    private Set<Long> items;

    public ShoppingCart() {

    }

    public Set<Long> getItems() {
        return items;
    }

    public void setItems(Set<Long> items) {
        this.items = items;
    }

    public void addItems(Set<Long> items) {
        this.items.addAll(items);
    }
}
