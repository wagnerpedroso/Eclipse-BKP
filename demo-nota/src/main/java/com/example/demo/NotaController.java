package com.example.demo;

import com.example.demo.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/nota")
public class NotaController {

    private final NotaRepository notaRepository;

    public NotaController(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    @GetMapping
    public ResponseEntity<List<Nota>> getNota(UriComponentsBuilder uriBuilder){
        List<Nota> lista = notaRepository.findAll();
        URI uri = uriBuilder.path("/nota/").buildAndExpand(lista).toUri();

        return ResponseEntity.ok().body(lista);
    }

    @PostMapping
    public ResponseEntity<Nota> postNota(@RequestBody @Valid Nota nota, UriComponentsBuilder uriBuilder){
        int notaId = notaRepository.add(nota);

        URI uri = uriBuilder.path("/nota/{id}").buildAndExpand(notaId).toUri();

        return ResponseEntity.created(uri).body(nota);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nota> putNota(@PathVariable int id,@RequestBody @Valid Nota nota, UriComponentsBuilder uriBuilder){
        Nota notaNova = notaRepository.update(id, nota);

        URI uri = uriBuilder.path("/nota/{id}").buildAndExpand(notaNova).toUri();

        return ResponseEntity.created(uri).body(notaNova);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Nota> deleteNota(@PathVariable int id, UriComponentsBuilder uriBuilder){
        Nota notaRemovida = notaRepository.delete(id);

        URI uri = uriBuilder.path("/nota/{id}").buildAndExpand(notaRemovida).toUri();

        return ResponseEntity.created(uri).body(notaRemovida);
    }
}
