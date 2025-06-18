package br.com.PojetoPraPets.Models.Vacina;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record VacinaRequest (
                 @NotBlank(message = "O campo não pode ser nulo.")
                 String nome,
                 @NotBlank(message = "O campo não pode ser nulo.")
                 LocalDate data,
                 @NotBlank(message = "O campo não pode ser nulo.")
                 String tipo
){
    public Vacina toVacina(){
        return new Vacina(null, data(), nome(), null, tipo());
    }

}
