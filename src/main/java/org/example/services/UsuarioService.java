package org.example.services;

import org.example.entities.Usuario;
import org.example.repositories.UsuarioRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private  UsuarioRepository repository;
    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Usuario findById(Long id){
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public Usuario insert(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario update(Long id, Usuario novoUsuario) {
        Usuario exeistence = findById(id);
        exeistence.setNome(novoUsuario.getNome());
        exeistence.setNome(novoUsuario.getEmail());
        // adicione outros campos conforme sua entidade
        return repository.save(exeistence);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
