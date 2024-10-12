package com.sh.springdemo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello")
    public String hello() {
        log.info("hello"); // /WEB-INF/views/hello.jsp
        return "hello";
    }

    @GetMapping("/ex1")
    //ex1을 선택하면 이 함수 선택 됨. 다른 것들도 매한가지.
    // view로 데이터 전달
    // ex1.jsp 와 연결되는 부분 <%-- 이게 파라미터를 보내는 과정 --%>
    // http://localhost:8080/ex1?name=aaa&age=10&gender=m 이거 쳐서 잘 되는지 확인
    public void ex1(@RequestParam("name") String name,
                    @RequestParam("age") int age,
                    @RequestParam("gender") String gender,
                    Model model) { // Model이거 만들어서 ex1.jsp가 연결됨

        log.info("ex1");
        log.info(name);
        log.info(age);
        log.info(gender);
        model.addAttribute("name", name);
        // model.은 views 폴더 ex1.jsp로 연결.
        model.addAttribute("age", age);
        model.addAttribute("gender", gender);
        //Attribute 속성
    }

    @GetMapping("/ex2/{name}")
    // http://localhost:8080/ex2/aaa 이거 쳐서 잘 되는 지 확인
    //@PathBariable 경로 변수 , aaa가 이름 위치
    public void ex2(@PathVariable("name") String name) {
        log.info("ex2");
        log.info(name);
    }

    @GetMapping("/ex3")
    // view로 데이터 전달
    // ex3.jsp 와 연결되는 부분 <%-- 이게 파라미터를 보내는 과정 --%>
    // http://localhost:8080/ex3?dueDate=2024-10-10 이렇게 입력해서 잘되는지 확인
    public void ex3(@RequestParam("dueDate") LocalDate dueDate, Model model) {
        log.info("ex3");
        log.info(dueDate);
        model.addAttribute("dueDate", dueDate);
    }

    //ex4랑 ex5랑 같이 봐야함. - ex5.jsp와 비교
    @GetMapping("/ex4")
    public String ex4(RedirectAttributes redirectAttributes) {
        log.info("ex4");
        redirectAttributes.addFlashAttribute("result", "Success");
        //FlashAttribute는 웹 페이지의 첫 화면에서는 데이터가 있지만, F5누르면 데이터가 사라짐.
        redirectAttributes.addAttribute("name", "aaaa");
        //addAttribute는 웹 페이지의 첫 화면에도 데이터가 있고, F5를 눌러도 데이터가 그대로 존재함.
        return "redirect:/ex5";
        //redirect: 를 설정하고 return하면 (jsp파일을 찾는 것이 아닌)
        // 다시 컨트롤러로 재 요청함.
    }

    @GetMapping("/ex5")
    public void ex5(@RequestParam("name") String name, Model model) {
        log.info("ex5");
        log.info(name);
        model.addAttribute("name", name);
    }

    //CommonExceptionAdvice.java랑 비교
    //http://localhost:8080/ex06?p1=a&p2=5 여기로 접속
    //http://localhost:8080/ex06?p1=a&p2=b 이렇게 치면 에러나야되는데 나는 왜 에러가 안나지..?
    @GetMapping("/ex06")
    public void ex6(@RequestParam("p1") String p1,
                    @RequestParam("p2") int p2) {
        log.info("ex6");
        log.info(p1);
        log.info(p2);
    }
}
