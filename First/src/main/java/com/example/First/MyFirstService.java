package com.example.First;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service

public class MyFirstService {

    private final MyFirstClass myFirstClass;
    @Getter
    @Value("${my.prop.int}")
    private int customProperty;

    public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String myFirstService() {
        return "The dependency is saying: "+myFirstClass.sayHello();
    }
}


//constructor, method, setter and field injection
//Can use @Autowired if more than one var are being injected
//We have to use Qualifier or primary annotations in case there are multiple beans