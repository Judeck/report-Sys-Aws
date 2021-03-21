package com.antra.controller;

import com.antra.service.UserService;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@Slf4j
public class MyController {

    @Autowired
    UserService userService;

    @GetMapping("api/{id}")
    public ResponseEntity<UserService> checkStatuc(@PathVariable String from) {
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping("/api")
    public ResponseEntity<UserService> changeStatus(@RequestBody @Valid User) {
        return new ResponseEntity<>(HttpStatus.Ok);
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> handleIO(IOException) {
        log.error("", e);
        return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
    }

}
