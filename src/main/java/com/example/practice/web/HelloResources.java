package com.example.practice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.HelloMessageResponseDTO;
import com.example.practice.service.logic.GreetingService;

@RestController
public class HelloResources {
    
    Logger log = LoggerFactory.getLogger(HelloResources.class);

    private GreetingService greetingService;

    public HelloResources(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
 
    @GetMapping("/hello")
    public ResponseEntity<HelloMessageResponseDTO> helloWorld() {
        
        log.trace("this is Log TRACE");
        log.debug("this is log DEBUG");
        log.info("this is log info");
        log.warn("this is log WARN");
        log.error("this is log ERROR");

        HelloMessageResponseDTO dto = new HelloMessageResponseDTO();
        dto.setMessage(greetingService.sayGreeting());
        return ResponseEntity.ok().body(dto);
    }
}
