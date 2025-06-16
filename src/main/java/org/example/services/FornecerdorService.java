package org.example.services;

import org.example.entities.Fornecedor;
import org.example.entities.Usuario;
import org.example.repositories.FornecedorRepository;
import org.example.repositories.UsuarioRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecerdorService {

    @Autowired
    private FornecedorRepository repository;
    public List<Fornecedor> findAll(){
        return repository.findAll();
    }

    public Fornecedor findById(Long id){
        Optional<Fornecedor> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));
    }

    public Fornecedor insert(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    public Fornecedor update(Long id, Fornecedor novoFornecedor) {
        Fornecedor exeistence = findById(id);
        exeistence.setNome(novoFornecedor.getNome());
        exeistence.setNome(novoFornecedor.getEmail());
        // adicione outros campos conforme sua entidade
        return repository.save(exeistence);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}