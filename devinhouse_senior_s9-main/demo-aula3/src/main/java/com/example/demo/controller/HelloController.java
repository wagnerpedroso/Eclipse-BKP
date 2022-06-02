package com.example.demo.controller;

import com.example.demo.model.Saudacao;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{nome}")
    public Saudacao hello(@PathVariable String nome){
        return new Saudacao("Hello " + nome);
    }

}
