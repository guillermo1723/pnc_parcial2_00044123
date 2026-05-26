package org.example.parcial2ncapas.dto.provider;

import org.example.parcial2ncapas.enums.MagicType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MagicProviderRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @NotNull(message = "El tipo es obligatorio")
    private MagicType type;
}
