package at.refugeescode.the_amazing_hello_world.initialize;

import at.refugeescode.the_amazing_hello_world.controller.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {

    @Bean
    ApplicationRunner start(HelloWorld helloWorld) {
        return args -> {
            String helloWorldStr = helloWorld.sayHelloWorld();
            System.out.println(helloWorldStr);
        };
    }

}
