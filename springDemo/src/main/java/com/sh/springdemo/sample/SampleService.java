package com.sh.springdemo.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString // 해당 클래스의 모든 필드 값 및 문자열 표현을 자동 생성.
public class SampleService {
    @Autowired
    private SampleDAO sampleDAO;
    @Autowired
    private ISampleDAO sampleDAOImpl;

    @Autowired
    @Qualifier("event")
    private ISampleDAO eventSampleDAO;
}
