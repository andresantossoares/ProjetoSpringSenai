package org.example.controller;

import org.apache.coyote.Response;
import org.example.entities.Usuario;
import org.example.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService service;


    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        Usuario usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }



    @PostMapping
    public  ResponseEntity<Usuario> insert(@RequestBody Usuario usuario) {
        Usuario novo = service.insert(usuario);
        return ResponseEntity.ok().body(novo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario usuario) {
        Usuario atualizado = service.update(id, usuario);
        return ResponseEntity.ok().body(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return  ResponseEntity.noContent().build();
    }


}
