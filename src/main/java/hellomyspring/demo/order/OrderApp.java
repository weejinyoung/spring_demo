package hellomyspring.demo.order;

import hellomyspring.demo.AppConfig;
import hellomyspring.demo.member.Grade;
import hellomyspring.demo.member.Member;
import hellomyspring.demo.member.MemberService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}