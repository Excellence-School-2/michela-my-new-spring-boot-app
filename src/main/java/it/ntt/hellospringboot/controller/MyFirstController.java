package it.ntt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // per rispondere con un contenuto ad una richiesta
public class MyFirstController {

    //dico come richiedere alle richieste GET in /hello e risponde con del testo
    @RequestMapping("/hello" ) //http://localhost:8080/hello
    public String helloWorld(){
        return "Hello World! This is my Controller";
    }
    
}
