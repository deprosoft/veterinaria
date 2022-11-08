package com.veterinaria.proyecto.application.ports.out.usuario;

import com.veterinaria.proyecto.application.domain.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioGateway {

    List<Usuario> getAll();
    Optional<Usuario> getUsuariobyId(Integer id);
    Usuario saveUsuario(Usuario usuario);
    Boolean deleteUsuario(Integer id);

    Usuario createUsuario(Usuario usuario);
    List<Usuario> findBynombreCompletoContains(String nombre);
}
