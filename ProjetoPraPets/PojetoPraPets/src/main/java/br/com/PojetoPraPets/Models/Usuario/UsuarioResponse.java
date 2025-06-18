package br.com.PojetoPraPets.Models.Usuario;

import br.com.PojetoPraPets.Models.Pet.Pet;

public record UsuarioResponse(
        Long id,
        String nome
) {
    public UsuarioResponse(Usuario usuario){
        this(usuario.getId(), usuario.getNome());
    }
}