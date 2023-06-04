package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        /*
        * 컨트롤러에서 리턴 값으로 문자를 반환하면 ViewResolver가 화면을 찾아서 처리한다.
        * resources/templates 경로의 viewName과 매핑
        */
        return "hello";
    }

    /*
    * Get방식으로 api가 호출될 때, parameter로 받아오는 값을 사용한다.
    * @RequestParam(value = "name", required = false)을 사용하여 name 값을 전달 받는다.
    * required를 false로 설정하면 값이 없어도 정상 호출이 된다.
    * http://localhost:8080/hello-mvc?name=spring
    */
    @GetMapping("hello-mvc")
    public String helloMve(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // "hello spring"
    }
    
    /*
    * @ResponseBody를 설정하면 뷰 이름을 반환하는 것이 아니라 데이터 그대로 전달하도록 인식한다.(HTTP body에 문자내용을 직접 반환)
    * viewResolver대신에 HttpMessageConverter가 동작한다.
    * 객체를 반환할 경우, 기본적으로 JSON 방식으로 데이터를 반환한다.
    *
    * 기본 문자 처리 : StringHttpMessageConverter
    * 기본 객체 처리 : MappingJackson2HttpMessageConverter
    *  
    */
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);

        return hello;
    }

    /*
    * 프로퍼티 방식
    */
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
