package com.sh.springdemo.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@~ : Annotation : 주석, 부가 설명
@Repository
//DAO(DataAcessObject) 데이터 접근 계층에 사용 - DB와 상호작용.
@Primary
public class SampleDAOImpl implements ISampleDAO{
    //A implements B : A는 B에 의해 구현되어진다.
    //ISampleDAO에 의해 구현되는 SampleDAOImpl 클래스를 작성한다
    //Impl(Implementation) 인터페이스의 구체적인 구현 클래스를 나타낼 때 사용된다.
}
