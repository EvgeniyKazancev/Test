public class Cat {
    String name;
    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.name ="Yuna";
        renameCat(cat);
        System.out.println(cat.name);
    }
    public static Cat renameCat(Cat cat) {
        System.out.println(cat.name);
        cat = new Cat();
        cat.name ="Mia";
        return  cat;
    }


}
