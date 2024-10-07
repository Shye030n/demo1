package com.sh.springdemo.sample;

import com.sh.springdemo.config.AppConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.naming.Context;
import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith({SpringExtension.class})
//@ContextConfiguration(classes = AppConfig.class) //myDto 할 때
@ContextConfiguration(locations = {"/test-context.xml", "file:src/main/webapp/WEB-INF/root-context.xml"}) // sample 할 때 주석 풀기
//@RequiredArgsConstructor

public class SampleTest {
    @Autowired
    private DataSource dataSource;

    @Autowired(required = false)
    private SampleService sampleService;

    //@Autowired //의존성 주입(Dependency Injection)을 사용할 때, 필요한 객체 자동으로 주입해줌
    //@Qualifier("sample1") //Bean이 여러개 있을 때 어떤 Bean을 주입할지 선택
        // ("")위치에 myDto1, myDto2, sample1, sample2로 바꿔서 해보기
    //private SampleDTO sampleDTO1;

    @Test
    public void ConnectionTest() throws Exception {
        Connection connection = dataSource.getConnection();
        log.info(connection);
    }

    @Test
    public void setSampleServiceTest(){
        log.info("setSampleServiceTest");
    }

//    @Test
//    public void testSample1(){
//        log.info(sampleDTO1);
//    }

    @Test
    public void testSamaple(){
        SampleDTO dto = new SampleDTO();
        dto.setAge(20);
        dto.setName("박경미");
        String[] hobbys={"수영","영화 감상"};
        dto.setHobby(hobbys);
        log.info(dto);
    }

    @Test
    public void testSample2(){
        ApplicationContext context = new ClassPathXmlApplicationContext(" /test-context.xml");
        SampleDTO dto1 = (SampleDTO) context.getBean("sample1");
        log.info(dto1);
        SampleDTO dto2 = (SampleDTO) context.getBean("sample2");
        log.info(dto2);
    }

    @Test
    public void testSample3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SampleDTO dto1 = (SampleDTO) context.getBean("myDto1");
        log.info(dto1);
        SampleDTO dto2 = (SampleDTO) context.getBean("myDto2");
        log.info(dto2);
    }
}
