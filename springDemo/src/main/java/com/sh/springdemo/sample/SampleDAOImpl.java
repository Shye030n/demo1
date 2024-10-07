package com.sh.springdemo.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class SampleDAOImpl implements ISampleDAO{
}
