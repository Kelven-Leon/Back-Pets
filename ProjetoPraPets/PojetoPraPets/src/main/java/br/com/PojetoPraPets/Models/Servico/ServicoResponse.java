package br.com.PojetoPraPets.Models.Servico;
import br.com.PojetoPraPets.Models.Pet.Pet;

public record ServicoResponse(
        Long id,
        String tipo) {


    public ServicoResponse(Servico servico){
        this(servico.getId(), servico.getTipo());
    }
}

