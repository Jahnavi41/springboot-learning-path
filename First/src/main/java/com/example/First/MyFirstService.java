package com.example.First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    @Autowired
    @Qualifier("bean2")
    private MyFirstClass myFirstClass;

    public String myFirstService() {
        return "The dependency is saying: "+myFirstClass.sayHello();
    }
}
