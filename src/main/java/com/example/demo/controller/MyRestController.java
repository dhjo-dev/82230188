package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class MyRestController {

    /**
     * 사번 조회
     *
     * @return 82230188
     */
    @GetMapping("/user")
    public ResponseEntity<?> user() {

        try {
            return ResponseEntity.ok("82230188");
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}