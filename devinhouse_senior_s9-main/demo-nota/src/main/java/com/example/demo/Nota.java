package com.example.demo;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Nota {

    @NotEmpty @NotNull
    private String titulo;
    
    @NotNull @NotEmpty
    private String nota;

    public Nota(
            String titulo,
            String nota
    ) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

}
