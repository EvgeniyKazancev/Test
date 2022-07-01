package Praktika;

public class Programmer {
    String name, company, position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

     String getPosition() {
        return position;

    }

     void work() {

        switch (position) {
            case "intern":
                 position = "junior";
            case "junior":
                position = "middle";
            case "middle":
                position = "senior";
            case "senior":
                position = "lead";
                break;
        }

    }
}