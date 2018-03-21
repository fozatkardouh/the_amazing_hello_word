package at.refugeescode.the_amazing_hello_world.controller;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private Hello hello;
    private World world;

    private HelloWorld(Hello hello, World world) {
        this.hello = hello;
        this.world = world;
    }

    public String sayHelloWorld() {
        return hello.sayHello() + " " + world.sayWorld();
    }

}
