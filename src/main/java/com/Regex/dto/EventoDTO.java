package com.Regex.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EventoDTO(

        @NotBlank(message = "Nome é obrigatório")
        @Size(min = 5, max = 80, message = "O nome tem que ter entre 5 e 80 caracteres")
        String nome,

        @NotNull(message = "O e-mail de contato é obrigatório")
        @Email(message = "O e-mail de contato deve ter um formato válido")
        String emailContato,

        @NotNull(message = "A data de início é obrigatória")
        @Future(message = "A data de início deve ser no futuro")
        LocalDate dataInicio,

        @NotNull(message = "O número de vagas é obrigatório")
        @Min(value = 10, message = "O mínimo de vagas é 10")
        @Max(value = 5000, message = "O máximo de vagas é 5000")
        Integer vagas,

        @NotNull(message = "O preço do ingresso é obrigatório")
        @PositiveOrZero(message = "O preço do ingresso deve ser positivo ou zero")
        BigDecimal precoIngresso,

        @NotBlank(message = "O logradouro é obrigatório")
        String logradouro,

        @NotBlank(message = "O número é obrigatório")
        String numero,

        @Pattern(regexp = "^\\d{5}-\\d{3}$", message = "O CEP deve seguir o formato XXXXX-XXX")
        String cep
) {
}
