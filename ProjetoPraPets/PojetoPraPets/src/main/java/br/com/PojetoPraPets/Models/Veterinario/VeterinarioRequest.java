package br.com.PojetoPraPets.Models.Veterinario;
import br.com.PojetoPraPets.Models.Pet.Pet;
import jakarta.validation.constraints.NotBlank;

public record VeterinarioRequest (
                    @NotBlank(message = "O campo não pode ser nulo.")
                    String nome,
                    @NotBlank(message = "O campo não pode ser nulo.")
                    String endereco,
                    @NotBlank(message = "O campo não pode ser nulo.")
                    String telefone
){
    public Veterinario toVeterinario(){
        return new Veterinario(null, nome(), endereco(), telefone());
    }
}
