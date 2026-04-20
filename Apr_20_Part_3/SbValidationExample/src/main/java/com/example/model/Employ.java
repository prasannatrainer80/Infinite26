package com.example.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {

    @NotNull(message = "Employee Id Cannot be Null")
    @Min(value=1, message="Empno Starts with 1")
    @Max(value=1000, message = "Empno Ends with 1000")
    private Integer empno;
    @NotBlank(message = "Employee Name Cannot Be Null")
    private String name;
    @NotNull(message = "Basic Cannot Be Null")
    @Min(value = 10000, message = "Basic Starts with 10000")
    @Max(value=100000, message = "Basic Ends with 100000")
    private Double basic;
}
