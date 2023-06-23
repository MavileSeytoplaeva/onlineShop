package pro.sky.onlineshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.onlineshop.service.ConsumerServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class ConsumerController {
    private final ConsumerServiceImpl consumerService;

    public ConsumerController(ConsumerServiceImpl consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("items") Set<Long> idItems) {
        return consumerService.add(idItems).toString();
    }

    @GetMapping("/get")
    public String get() {
        return consumerService.getOrder().toString();
    }
}
