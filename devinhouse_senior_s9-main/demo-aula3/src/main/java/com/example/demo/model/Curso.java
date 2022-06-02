package com.example.demo.model;

import com.example.demo.controller.form.CursoForm;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Curso {

    @NotNull @NotEmpty
    private String nome;

    @NotNull @NotEmpty
    private String data;

    private List<String> nomesAlunos;

    public Curso(String nome, String data, List<String> nomesAlunos) {
        this.nome = nome;
        this.data = data;
        this.nomesAlunos = nomesAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getNomesAlunos() {
        return nomesAlunos;
    }

    public void setNomesAlunos(List<String> nomesAlunos) {
        this.nomesAlunos = nomesAlunos;
    }


}

