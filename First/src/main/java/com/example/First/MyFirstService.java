package com.example.First;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-2.properties")
})
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    @Value("${my.prop}")
    @Getter
    private String customProperty;

    @Value("Hello! New property value.")
    @Getter
    private String customPropertyString;

    @Value("123")
    @Getter
    private Integer customPropertyInt;

    @Getter
    @Value("${my.field}")
    private String customProperty2;
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