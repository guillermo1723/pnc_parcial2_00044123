package org.example.parcial2ncapas.service;

import org.example.parcial2ncapas.dto.article.MagicArticleRequestDTO;
import org.example.parcial2ncapas.dto.article.MagicArticleResponseDTO;

public interface MagicArticleService {
    MagicArticleResponseDTO createArticle(
            MagicArticleRequestDTO requestDTO
    );
}
