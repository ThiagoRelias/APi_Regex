package com.Regex;

import jakarta.validation.constraints.*;

public record ClienteDTO() {
    @Min()
    @Max()
    @Size()
    @Future()
    @FutureOrPresent()
    @Email()
}
