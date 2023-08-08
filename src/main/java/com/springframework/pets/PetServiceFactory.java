package com.springframework.pets;

/**
 * Created by r.edward on {08/08/2023}
 */
public class PetServiceFactory {
    public PetService getPetService(String type){
        switch (type){
            case "cat":
                return new CatPetService();
            case "dog":
            default:
                return new DogPetService();
//                break; not need because return
        }
    }
}
