package com.helloworldapi.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
@RestController
public class ComplimentController {
    private Compliment[] compliments={
            new Compliment("You look nice today"),
            new Compliment("good coding"),
            new Compliment("Have a wonderful day")
    };
    private Random rnd=new Random();
    @RequestMapping("/random")
    ResponseEntity<Compliment>randomCompliment(){
        Compliment randomCompliment=compliments[rnd.nextInt(compliments.length)];
                return new ResponseEntity<>(randomCompliment, HttpStatus.OK);
    }
}
