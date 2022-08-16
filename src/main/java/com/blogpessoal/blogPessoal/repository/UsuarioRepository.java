package com.blogpessoal.blogPessoal.repository;

import com.blogpessoal.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByUsuario (String usuario);
    public List <Usuario> findAllByNomeContainingIgnoreCase(String nome);
    //Metodo para buscar o usuario pelo nome

    //PARAM reconhece a URI => http:localhost:8089/usuario/{usuario}
}
