package Pedigri;

public  class Cat {
    String name;
    int age;
    String owner;

    public Cat(String name,int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;

    }
 public String toString(){
        return "The cat" + name + "is already" + age + ". Her master " + owner + " takes care of her.";
 }
    void eat(){

    }
    void run(){

    }
    private String getName() {
        return name;
    }
    private int getAge() {
        return age;
    }
    private String getOwner() {
        return owner;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setAge(int age) {
        this.age = age;
    }
    private void setOwner(String owner) {
        this.owner = owner;
    }
}
