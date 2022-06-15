package com.sixiemeGeste.application.controller;

import com.sixiemeGeste.application.DTO.UserDTO;
import com.sixiemeGeste.application.port.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserServicePort userServicePort;
    private final ModelMapper modelMapper;

    @GetMapping("/register")
    public String createUserForm() {
        return "register";
    }

    @PostMapping("/register")
    public String createUser(@RequestParam String name, @RequestParam String lastname, @RequestParam String email, @RequestParam String username, ModelMap modelMap) {
        if (this.userServicePort.getUserByUsernameOrEmail(email, username) != null) {
            modelMap.put("errorMsg", "Username or Email Taken");
            return "register";
        }
        UserDTO userDTO = new UserDTO(name, lastname, email, username);
        this.userServicePort.saveUser(userDTO);
        return "redirect:/user/list";
    }

    @GetMapping("/list")
    public String listOfUsers(Model model) {
        model.addAttribute("users", userServicePort.getUsers());
        return "list";
    }
}
