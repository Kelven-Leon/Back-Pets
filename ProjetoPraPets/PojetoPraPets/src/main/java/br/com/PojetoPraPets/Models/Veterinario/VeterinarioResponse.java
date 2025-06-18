package br.com.PojetoPraPets.Models.Veterinario;

public record VeterinarioResponse(
        String nome,
        Long id
) {
    public VeterinarioResponse(Veterinario veterinario){
        this(veterinario.getNome(), veterinario.getId());
    }
}
