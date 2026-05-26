package org.example.parcial2ncapas.dto.article;

import org.example.parcial2ncapas.enums.MagicType;

import jakarta.validation.constraints.*;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MagicArticleRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @NotNull(message = "El tipo es obligatorio")
    private MagicType type;

    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(
            value = "0.01",
            message = "El precio debe ser mayor a cero"
    )
    private BigDecimal price;

    @NotNull(message = "El proveedor es obligatorio")
    private Long providerId;
}