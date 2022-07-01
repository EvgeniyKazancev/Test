package Praktika;

public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    public Human(String name, int age){
        this.name = name;
        this.age =age;


    }
    public Human (String name,String address){
        this.name = name;
        this.address = address;

    }
    public Human (String name, int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = 60;



    }
    public Human (String name, int age,String work ){
        this.name = "Ivan";
        this.work = work;
        this.age = age;

    }
    public  Human(int age, int weight,String address,String work){
        this.age = 25;
        this.weight = 60;
        this.address = address;
        this.work = work;

    }
}
