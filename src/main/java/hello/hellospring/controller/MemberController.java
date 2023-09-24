package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    // 스프링 컨테이너에 있는 memberService와 매핑해준다.
    // 생성자에 @Autowired를 설정하면 객체를 생성할 때 스프링 컨테이너에 있는 Service 빈을 넣어준다.
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
