package br.com.PojetoPraPets.Models.Vacina;
import br.com.PojetoPraPets.Models.Pet.Pet;

public record VacinaResponse(
        String nome
)
{
        public VacinaResponse(Vacina vacina){
        this(vacina.getPet().getNome());
    }
}


