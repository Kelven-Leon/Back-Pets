package br.com.PojetoPraPets.Repositories;

import br.com.PojetoPraPets.Models.Usuario.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    }

