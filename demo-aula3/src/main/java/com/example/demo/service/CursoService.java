package com.example.demo.service;

import com.example.demo.model.Curso;
import com.example.demo.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements CrudService<Curso> {
    
    private CrudRepository<Curso> cursoRepository;

    public CursoService(CrudRepository<Curso> cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public List<Curso> get() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso findById(int id) {
        return cursoRepository.findById(id);
    }

    @Override
    public int save(Curso curso2) {
        return cursoRepository.add(curso2);
    }

    @Override
    public Curso update(int id, Curso curso2) {
        return cursoRepository.update(id, curso2);
    }

    @Override
    public Curso delete(int id) {
        return cursoRepository.delete(id);
    }
}
