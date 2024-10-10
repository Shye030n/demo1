package com.sh.springdemo.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter, toString() 메서드 자동으로 생성하는 메서드
@NoArgsConstructor // 인자가 없는 기본생성자를 자동으로 생성해주는 역할
@AllArgsConstructor // 모든 인자를 갖춘 생성자를 조동으로 생성해주는 역할
public class SampleDTO {
    private String name;
    // SampleDTO 클래스 안에서만 사용할 문자열 변수 name tjsdjs
    private int age;
    private String[] hobby;
    // hobby는 여러개일 수도 있기에 배열로 선언.


}

