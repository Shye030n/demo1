package com.sh.springdemo.controller;

import com.sh.springdemo.dto.TodoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo")
public class TodoController {

    // localgost:8080//todo/list 이거랑 같다.
    //@RequestMapping(value="/list", method= RequestMethod.GET)
    @GetMapping("/list")
    public void list() { //void=아무것도 반환하지 않는다(return 필요X)
        log.info("list");
    }

    //@RequestMapping(value="/register", method= RequestMethod.GET)
    @GetMapping("/register")
    public void registerGet(){
        log.info("registerGet");
        //log: 로그 객체로서, 로그를 기록하는 역할
            //log란, 프로그램이 실행될 때 발생하는 다양한 이벤트나 상태 정보를 기록하는 것
            //  애플리케이션의 중요한 정보, 에러를 기록 -> 시스템의 작동 확인 및 디버깅에 도움 줌
        //info(): (information: 정보)
        //"list": 기록할 메세지(로그 파일에 남는 내용)
//        todo/register을 Get 요청
    }

    //@RequestMapping(value="/register", method= RequestMethod.POST)
    @PostMapping("/register")
    public String registerPost(TodoDTO todoDTO, Model model){
        log.info("registerPost");
        //model.addAttribute("dto", todoDTO);
        return "redirect:/todo/list";
        //redirect: 를 설정하고 return하면 (jsp파일을 찾는 것이 아닌) 다시 todolist를 부를 수 있는 컨트롤러로 간대..ㅋ
            // http://localhost:8080/todo/list 여기에서 register을 클릭하면
            //http://localhost:8080/todo/register로 이동하는데, 여기서 값을 입력하면
            //원래는 입력된 값인 register로 가지만,
            //http://localhost:8080/todo/list 여기로 이동해서 응답이 아닌, 재요청을 하게 된다.
            // 그래서 값이 비어있다
        //todo/register을 post 요청
    }
}
