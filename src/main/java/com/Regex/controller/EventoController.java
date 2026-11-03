package com.Regex.controller;


import com.Regex.dto.EventoDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @PostMapping
    public ResponseEntity<EventoDTO> criar (@Valid @RequestBody EventoDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
