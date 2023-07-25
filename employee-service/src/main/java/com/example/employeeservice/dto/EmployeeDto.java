package com.example.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;

    @Schema(
            description = "firstName"
    )
    private String firstName;

    @Schema(
            description = "lastName"
    )
    private String lastName;

    @Schema(
            description = "email"
    )
    private String email;

    @Schema(
            description = "departmentCode"
    )
    private String departmentCode;

    @Schema(
            description = "organizationCode"
    )
    private String organizationCode;
}
