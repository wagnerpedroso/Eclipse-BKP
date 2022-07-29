package com.example.demo;

public class ErroDeFormulariooDto {
    
    private String campo;
    private String erro;

    public ErroDeFormulariooDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getErro() {
        return erro;
    }
}
