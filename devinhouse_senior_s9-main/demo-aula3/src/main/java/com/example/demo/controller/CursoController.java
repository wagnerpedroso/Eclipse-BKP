package com.example.demo.controller;

import com.example.demo.model.Curso;
import com.example.demo.service.CrudService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private CrudService<Curso> cursoService;

    public CursoController(CrudService<Curso> cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping(produces="application/json")
    public ResponseEntity<List<Curso>> getCursos(){
        return ResponseEntity.ok().body(cursoService.get());
    }

    @GetMapping(produces="application/json",path = "/{id}")
    public ResponseEntity<Curso> getCurso(@PathVariable int id){
        return ResponseEntity.ok().body(cursoService.findById(id));
    }

    @PostMapping(produces="application/json", consumes = "application/json")
    public ResponseEntity<String> postCurso(
            @RequestBody @Validated Curso curso2,
            UriComponentsBuilder uriBuilder
    ){
        URI uri = uriBuilder.path("/curso/").buildAndExpand(curso2).toUri();
        System.out.println(uri);
        return  ResponseEntity.created(uri).body("\"id:\"" + cursoService.save(curso2));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> putCurso(
            @PathVariable int id, @RequestBody @Validated Curso curso2,
            UriComponentsBuilder uriBuilder
    ){
        URI uri = uriBuilder.path("/curso/{id}").buildAndExpand(id).toUri();
        System.out.println(uri);
        return  ResponseEntity.ok().body( cursoService.update(id, curso2));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Curso> deletetCurso(@PathVariable int id, UriComponentsBuilder uriBuilder){
        URI uri = uriBuilder.path("/curso/{id}").buildAndExpand(id).toUri();
        System.out.println(uri);
        return  ResponseEntity.ok().body(cursoService.delete(id));
    }
}
