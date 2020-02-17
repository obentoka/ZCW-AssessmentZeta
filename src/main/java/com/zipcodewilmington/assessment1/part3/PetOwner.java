package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String ownerName;
    static Pet[] petList;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.ownerName = name;
        this.petList = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(petList == null){
            petList = new Pet[1];
            petList[0] = pet;
        }else {
            int oldSize = this.petList.length;
            Pet[] newPetList = new Pet[oldSize + 1];
            newPetList = this.petList.clone();
            newPetList[newPetList.length - 1] = pet;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < petList.length; i++) {
            if(petList[i].equals(pet)){
                petList[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
//        if(this.getName().equals(pet.getOwner().getName())){
//            return true;
//        }
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
        return sumAge/petList.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return (Integer) petList.length;
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
        return this.petList;
    }
}
