package br.com.PojetoPraPets.Models.Servico;
import br.com.PojetoPraPets.Models.Pet.Pet;
import jakarta.validation.constraints.NotBlank;

public record ServicoRequest(
        @NotBlank( message = "O Nome não pode ser Nulo e nem Vazio.")
        Long id,
        @NotBlank( message = "O Nome não pode ser Nulo e nem Vazio.")
        String tipo,
        @NotBlank( message = "O Nome não pode ser Nulo e nem Vazio.")
        Long petId
)

 {
    public Servico toServico(Pet pet){
    return new Servico(id, tipo, pet);
    }
}
