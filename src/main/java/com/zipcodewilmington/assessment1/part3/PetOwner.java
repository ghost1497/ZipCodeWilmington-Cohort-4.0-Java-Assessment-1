package com.zipcodewilmington.assessment1.part3;


import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> theMiddleMan = new ArrayList<>();
        if(this.pets != null) {
            for (Pet entry : this.pets) {
                theMiddleMan.add(entry);
            }
        }
        theMiddleMan.add(pet);
        pet.setOwner(this);
        this.pets = theMiddleMan.toArray(new Pet[theMiddleMan.size()]);
        }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> buffer = new ArrayList<>();
        for (Pet entry : this.pets) {
            if (!entry.equals(pet)) {
                buffer.add(entry);
            }
        }
        buffer.toArray(this.pets);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        //THIS TOOK ME A WHOLE HOUR BUT IT WAS SOOOO SIMPLE
        for(Pet entry : pets) {
            if (entry.equals(pet)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer currentAge = pets[0].getAge();
        for(Pet entry : pets){
            if (entry.getAge() < currentAge){
                currentAge = entry.getAge();
            }
        }
        return currentAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer currentAge = pets[0].getAge();
        for(Pet entry : pets){
            if (entry.getAge() > currentAge){
                currentAge = entry.getAge();
            }
        }
        return currentAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float averageAge = 0.0f;
        for(Pet entry : pets){
                averageAge += entry.getAge();
            }
        return averageAge/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
