public class AbstractFactory {
    interface Meat{
        void print();
    }
    /*
        Создадим классы Chicken и Pork, реализующие интерфейс Meat.
        На схеме обозначены, как ProductA1 и ProductA2.
    */
    static class Chicken implements Meat{
        @Override
        public void print() {
            System.out.println("Create Chiken's meat");
        }
    }

    static class Pork implements Meat{
        @Override
        public void print() {
            System.out.println("Create pork");
        }
    }

    /*
        Для семейства продуктов для гарнира создадим общий интерфейс Garnish, который на схеме паттерна обозначен, как abstractProductB.
    */
    interface Garnish{
        void print();
    }

    /*
        Создадим классы Rice и Buckwheat, реализующие интерфейс Garnish. На схеме обозначены, как ProductB1 и ProductB2.
    */
    static class Rice implements Garnish{
        @Override
        public void print() {
            System.out.println("Create garnish with rice");
        }
    }

    static class Buckwheat implements Garnish{
        @Override
        public void print() {
            System.out.println("Create garnish with buckwheat");
        }
    }
    /*
        Теперь нам нужно создать интерфейс, который описывает способ создания завтраков. На схеме соответствует AbsractFactory. В нашем случае завтраки будут состоять из мяса и гарнира, т.е. будут возвращать объекты Meat и Garnish.
    */
    interface BreakfastFactory{
        Meat createMeat();
        Garnish createGarnish();
    }

    /*
         Теперь нам остается реализовать из интерфейса BreakfastFactory фабрики конкретных завтраков. BreakfastOne будет состоять из мяса курицы и гречки. BreakfastTwo - из свинины и риса.
    */
    static class BreakfastOne implements BreakfastFactory{
        @Override
        public Meat createMeat() {
            return new Chicken();
        }

        @Override
        public Garnish createGarnish() {
            return new Buckwheat();
        }
    }

    static class BreakfastTwo implements BreakfastFactory{
        @Override
        public Meat createMeat() {
            return new Pork();
        }

        @Override
        public Garnish createGarnish() {
            return new Rice();
        }
    }

    /*
        Теперь осталось убедиться, что создав фабрику для BreakfastOne, мы получим завтрак, состоящий из курицы и гречки.
    */
    public static void main(String[] args) {
        //  Попробуйте заменить new BreakfastOne() на new BreakfastTwo()
        //  и увидите, мы получим завтрак из свинины и риса.
        BreakfastFactory breakfastFactory = new BreakfastTwo();
        Meat meat = breakfastFactory.createMeat();
        Garnish garnish = breakfastFactory.createGarnish();

        System.out.println("Creating breakfast");
        meat.print();
        garnish.print();
    }
}
