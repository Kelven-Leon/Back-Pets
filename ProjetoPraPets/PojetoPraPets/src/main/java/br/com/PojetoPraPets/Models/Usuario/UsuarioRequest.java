package br.com.PojetoPraPets.Models.Usuario;
import jakarta.validation.constraints.NotBlank;

public record UsuarioRequest (
        @NotBlank(message = "O Nome não pode ser Nulo e nem Vazio.")
        String nome,
        @NotBlank(message = "O Nome não pode ser Nulo e nem Vazio.")
        String senha,
        @NotBlank(message = "O Nome não pode ser Nulo e nem Vazio.")
        String email
){
    public Usuario toUsuario(){
        return new Usuario(null, nome(), senha(), email());
    }

}