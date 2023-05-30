package com.example.familytodo.web;

import com.example.familytodo.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class UsersController {
    private final UsersService service;
}
