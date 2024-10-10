package com.sh.springdemo.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("event")
//event 빈을 주입하도록 명시
//여러개의 같은 타입의 빈이 있을 때, 어떤 빈을 주입받을 지 명시
public class EventSampleImpl implements ISampleDAO{
}
