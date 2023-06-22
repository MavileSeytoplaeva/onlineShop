package pro.sky.onlineshop.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Scope (scopeName = "session")
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
