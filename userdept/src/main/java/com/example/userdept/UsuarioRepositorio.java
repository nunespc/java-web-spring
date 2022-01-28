package com.example.userdept;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userdept.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
