package com.example.demo.repository;

import com.example.demo.Nota;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NotaRepository implements CrudRepository<Nota>{

    private final List<Nota> mapNota = new ArrayList<>();

    @Override
    public List<Nota> findAll() {
        return mapNota;
    }

    @Override
    public Nota findById(int id) {
       return mapNota.get(id);
    }

    @Override
    public int add(Nota nota) {
        this.mapNota.add(nota);
        return this.mapNota.indexOf(nota);
    }

    @Override
    public Nota update(int id, Nota nota) {
        return this.mapNota.set(id, nota);
    }

    @Override
    public Nota delete(int id) {
        return this.mapNota.remove(id);
    }

}
