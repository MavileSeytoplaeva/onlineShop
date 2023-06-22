package pro.sky.onlineshop.interfaces;

import java.util.Set;

public interface ConsumerService {

    Set<Long> add(Set<Long> idItems);

    Set<Long> getOrder();
}
