package hellomyspring.demo;

import hellomyspring.demo.member.Grade;
import hellomyspring.demo.member.Member;
import hellomyspring.demo.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("find Member = " + findMember.getName());
        System.out.println("new Member = " + member.getName());
    }
}
