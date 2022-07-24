package Pedigri;

import Pedigri.Cat;

public class PedigreeCat extends Cat {
    String breed;
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public PedigreeCat(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }
    public String toString(){
        return "The cat" + name + "is very beautiful, although she is now" + age + ", she belongs to the breed " + breed + " , and her owner " + owner;
    }
}
