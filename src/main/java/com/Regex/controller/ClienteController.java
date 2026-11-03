package com.Regex.controller;


import com.Regex.dto.ClienteDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cliente")
@RestController
public class ClienteController {

    @PostMapping
    public void setCliente(@Valid @RequestBody ClienteDTO clienteDTO){

    }
}
