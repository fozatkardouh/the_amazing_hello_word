package at.refugeescode.the_amazing_hello_world.controller;

import org.springframework.stereotype.Component;

@Component
public class Hello {

    public String sayHello() {
        return "hello";
    }

}
