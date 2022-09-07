package All;

import java.util.Objects;

public class Pet implements Comparable<Pet> {
    private final String animalBreed;
    private final String name;
    private double weight;

    public Pet(String animalBreed, String name, double weight) {
        if (animalBreed == null || name == null || weight == 0) {
            throw new IllegalArgumentException();
        }
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return animalBreed.equals(pet.animalBreed) && name.equals(pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "animalBreed='" +
                animalBreed + '\'' + ", name='" +
                name + '\'' + ", weight=" +
                weight +'}' +"\n" ;
    }




        @Override
        public int compareTo(Pet o) {
            return (int) (weight - o.weight);
        }
    }
