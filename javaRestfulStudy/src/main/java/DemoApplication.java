package com.example.hello.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
Accessing URL: http://localhost:8080/hello/julia/david/
*/

@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }
    @RequestMapping(value="/{firstName}/{lastName}",method = RequestMethod.GET)
    public String  hello(@PathVariable("firstName") String fName,@PathVariable("lastName") String lName){
        return String.format("Hello zhukezhi :%s %s",fName,lName);

    }

}