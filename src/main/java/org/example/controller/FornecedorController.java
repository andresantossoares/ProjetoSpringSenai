package org.example.controller;


import org.example.entities.Fornecedor;
import org.example.services.FornecerdorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class FornecedorController {


    @Autowired
    private FornecerdorService service;


    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAll() {
        List<Fornecedor> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id")
    public ResponseEntity<Fornecedor> findById(@PathVariable Long id) {
        Fornecedor fornecedor = service.findById(id);
        return ResponseEntity.ok().body(fornecedor);
    }



    @PostMapping
    public  ResponseEntity<Fornecedor> insert(@RequestBody Fornecedor fornecedor) {
        Fornecedor novo = service.insert(fornecedor);
        return ResponseEntity.ok().body(novo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> update(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        Fornecedor atualizado = service.update(id, fornecedor);
        return ResponseEntity.ok().body(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return  ResponseEntity.noContent().build();
    }


}
