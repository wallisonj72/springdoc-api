package com.wallison.springdoc.controller;

import com.wallison.springdoc.model.User;
import com.wallison.springdoc.service.UserService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "Listar Todos", description ="Esse metodo lista todos os usuarios!")
    @GetMapping("/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }
    @Operation(summary = "Listar", description ="Esse metodo lista um usuario pelo id")
    @GetMapping("/getUser")
    public User getUser(Long id) {
        return userService.getUser(id);
    }

    @Operation(summary = "Salvar", description ="Esse metodo salva um novo usuario!")
    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @Operation(summary = "Deletar", description ="Esse metodo apaga usuarios pelo id!")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    @Operation(summary = "Atualizar", description ="Esse metodo atualiza um usuario pelo id!")
    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestBody User newUser) {
        return userService.update(id, newUser);
    }
}
