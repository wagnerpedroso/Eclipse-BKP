package com.example.demo.configuration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErroRequisicaoDto {
    private String campo;
    private String erro;
}
