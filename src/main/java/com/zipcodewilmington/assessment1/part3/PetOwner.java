package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String ownerName;
    ArrayList<Pet> petList = new ArrayList<Pet>();
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        if(name != null)
            this.ownerName = name;
        if(pets != null) {
            petList.addAll(Arrays.asList(pets));
            for(Pet i : petList){
                i.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        petList.add(pet);
        pet.setOwner(this);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        petList.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if(petList != null){
            for(Pet i : petList){
                if(i.equals(pet)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = Integer.MAX_VALUE;
        for(Pet i : petList){
            if(i.age < youngestAge){
                youngestAge = i.age;
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = Integer.MIN_VALUE;
        for(Pet i : petList){
            if(i.age > oldestAge){
                oldestAge = i.age;
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sumAge = 0f;
        for(Pet i : petList){
            sumAge += i.age;
        }
        return sumAge/petList.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petList.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if(petList.size() == 0){
            petList.add(null);
            return petList.toArray(new Pet[1]);
        }else {
            Pet[] returnPets = petList.toArray(new Pet[petList.size()]);
            return returnPets;
        }
    }
}
