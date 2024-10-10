package com.sh.springdemo.config;

import com.sh.springdemo.sample.SampleDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 밑에 클래스의 객체를 자동으로 준비하는 어노테이션
public class AppConfig {
    @Bean // 객체 준비 다 됐어~ 이런 느낌
    public SampleDTO myDto1(){
        //SampleDTO에서 사용할 myDto1이라는 메서드(함수) 선언
        String[] hobbys={"잠자기", "여행"};
        //문자열 배열 hobbys에 "잠자기,"여행" 값을 넣음
        return new SampleDTO("윤요섭",25,hobbys);
        //SampleDTO클래스에 새로운 객체와 객체의 속성을 myDto1에 반환.
    }
    @Bean
    public SampleDTO myDto2(){
        String[] hobbys={"등산", "여행"};
        return new SampleDTO("박경미",20,hobbys);
    }
}
