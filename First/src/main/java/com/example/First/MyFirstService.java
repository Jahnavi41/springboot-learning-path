package com.example.First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;
    private Environment environment;

    @Autowired
     void setMyFirstClass(@Qualifier("bean2")MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    @Autowired
    void setEnvironment(Environment environment){
        this.environment = environment;
    }

    public String getJavaVersion() {
        return "Java version is: "+environment.getProperty("java.version");
    }

    public String getOs() {
        return "OS is: "+environment.getProperty("os.name");
    }

    public String readProperty() {
        return "Property from application.properties files: "+environment.getProperty("my.custom.property");
    }

    public String myFirstService() {
        return "The dependency is saying: "+myFirstClass.sayHello();
    }
}


//constructor, method, setter and field injection
//Can use @Autowired if more than one var's are being injected
//We have to use Qualifier or primary annotations in case there are multiple beans