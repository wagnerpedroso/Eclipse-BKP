package com.example.demo.repository;

import com.example.demo.model.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepository implements CrudRepository<Curso>{

    private final List<Curso> lista = new ArrayList<>();

    @Override
    public List<Curso> findAll() {
        return lista;
    }

    @Override
    public Curso findById(int id) {
       return lista.get(id);
    }

    @Override
    public int add(Curso curso2) {
        this.lista.add(curso2);
        return this.lista.indexOf(curso2);
    }

    @Override
    public Curso update(int id, Curso curso2) {
        return this.lista.set(id, curso2);
    }

    @Override
    public Curso delete(int id) {
        return this.lista.remove(id);
    }

}
