package Practic2.Z1.Z5;

public class Teacher extends People{
    String subject;

    public Teacher(String name,  int age,String profession, String subject) {
        super(name,  age, profession);
        this.subject = subject;
    }
    @Override
    public String getName() {

        return name;
    }

    @Override
    public String getProfession() {

        return profession;
    }

    @Override
    public int getAge() {

        return age;
    }

    public String getSubject() {
        return subject;
    }
    String giveALesson(){
        return "The lesson was ended";
    }
}
