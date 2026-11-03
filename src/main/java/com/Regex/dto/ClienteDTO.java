package com.Regex.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record ClienteDTO(
        @Size(min = 3, max = 50)
        String nome,
        @Email
        String email,
        @Min(18)
        @Max(120)
        Integer idade,
        @Future
        LocalDate dataAgendamento,
        @FutureOrPresent
        LocalDate dataCadastro
) {
}