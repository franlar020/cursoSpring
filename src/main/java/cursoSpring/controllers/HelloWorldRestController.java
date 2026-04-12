package cursoSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping({"/hello", "/hw", "/hola", "/fr"})

    public String helloWorld (){
        System.out.println("Solicitud ejecutada!");
        return "Hello, World, Aloha, buenas tardes, buenas noches";
    }
}
