package hellomyspring.demo;

import hellomyspring.demo.discount.FixDiscountPolicy;
import hellomyspring.demo.member.MemberService;
import hellomyspring.demo.member.MemberServiceImpl;
import hellomyspring.demo.member.MemoryMemberRepository;
import hellomyspring.demo.order.OrderService;
import hellomyspring.demo.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }
}
