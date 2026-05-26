package org.example.parcial2ncapas.dto.provider;

import org.example.parcial2ncapas.enums.MagicType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MagicProviderResponseDTO {

        private Long id;

        private String name;

        private MagicType type;
}