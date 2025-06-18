package br.com.PojetoPraPets.Models.Pet;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record PetRequest (
                 @NotBlank( message = "O Nome não pode ser Nulo e nem Vazio.")
                 String nome,
                 @NotBlank( message = "O campo Espécie não pode ser nulo ou vazio.")
                 String especie,
                 @NotBlank( message = "O campo Raça não pode ser nulo ou vazio.")
                 String raca,
                 @NotBlank( message = "Escolha a opção M ou F")
                 String sexo,
                 @NotBlank( message = "Informe uma data de nascimento.")
                 LocalDate dataDeNascimento)
{
    public Pet toPet(){
        return new Pet(null, null, nome(), especie(), raca(), sexo(),dataDeNascimento(), null);
    }

}
