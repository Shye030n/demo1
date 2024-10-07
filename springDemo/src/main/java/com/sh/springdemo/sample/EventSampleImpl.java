package com.sh.springdemo.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("event")
public class EventSampleImpl implements ISampleDAO{
}
