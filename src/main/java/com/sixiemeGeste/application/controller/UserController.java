package com.sixiemeGeste.application.controller;

import com.sixiemeGeste.application.port.UserServicePort;
import com.sixiemeGeste.domain.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.modelmapper.ModelMapper;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
@Validated
public class UserController {
    private final UserServicePort userServicePort;
    private final ModelMapper modelMapper;

}
