package org.example.parcial2ncapas.dto.article;

import org.example.parcial2ncapas.enums.MagicType;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MagicArticleResponseDTO {

        private Long id;

        private String name;

        private MagicType type;

        private BigDecimal price;

        private String providerName;
}