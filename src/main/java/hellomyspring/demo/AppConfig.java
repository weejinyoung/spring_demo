package hellomyspring.demo;

import hellomyspring.demo.discount.DiscountPolicy;
import hellomyspring.demo.discount.FixDiscountPolicy;
import hellomyspring.demo.discount.RateDiscountPolicy;
import hellomyspring.demo.member.MemberRepository;
import hellomyspring.demo.member.MemberService;
import hellomyspring.demo.member.MemberServiceImpl;
import hellomyspring.demo.member.MemoryMemberRepository;
import hellomyspring.demo.order.OrderService;
import hellomyspring.demo.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
