package hellomyspring.demo.order;

import org.springframework.stereotype.Component;

@Component
public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
