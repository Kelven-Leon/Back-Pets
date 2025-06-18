package br.com.PojetoPraPets.Models.Pet;

public record PetResponse(
         String nome,
         String especie) {


    public PetResponse(Pet pet){
        this(pet.getNome(), pet.getEspecie());
    }
}
