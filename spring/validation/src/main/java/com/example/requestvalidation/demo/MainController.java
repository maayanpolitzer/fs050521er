package com.example.requestvalidation.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/p")
public class MainController {

    private static Person person = null;

    @GetMapping
    public ResponseEntity getPerson(){
        if(person != null) {
            return new ResponseEntity(person, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity createPerson(
            @Valid @RequestBody Person request
    ){
        person = request;
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
