package at.refugeescode.the_amazing_hello_world.controller;

import org.springframework.stereotype.Component;

@Component
public class World {

    public String sayWorld() {
        return "world";
    }

}
