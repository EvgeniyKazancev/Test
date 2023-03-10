public class AbstractFactory {
    interface Meat{
        void print();
    }
    /*
        �������� ������ Chicken � Pork, ����������� ��������� Meat.
        �� ����� ����������, ��� ProductA1 � ProductA2.
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
        ��� ��������� ��������� ��� ������� �������� ����� ��������� Garnish, ������� �� ����� �������� ���������, ��� abstractProductB.
    */
    interface Garnish{
        void print();
    }

    /*
        �������� ������ Rice � Buckwheat, ����������� ��������� Garnish. �� ����� ����������, ��� ProductB1 � ProductB2.
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
        ������ ��� ����� ������� ���������, ������� ��������� ������ �������� ���������. �� ����� ������������� AbsractFactory. � ����� ������ �������� ����� �������� �� ���� � �������, �.�. ����� ���������� ������� Meat � Garnish.
    */
    interface BreakfastFactory{
        Meat createMeat();
        Garnish createGarnish();
    }

    /*
         ������ ��� �������� ����������� �� ���������� BreakfastFactory ������� ���������� ���������. BreakfastOne ����� �������� �� ���� ������ � ������. BreakfastTwo - �� ������� � ����.
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
        ������ �������� ���������, ��� ������ ������� ��� BreakfastOne, �� ������� �������, ��������� �� ������ � ������.
    */
    public static void main(String[] args) {
        //  ���������� �������� new BreakfastOne() �� new BreakfastTwo()
        //  � �������, �� ������� ������� �� ������� � ����.
        BreakfastFactory breakfastFactory = new BreakfastTwo();
        Meat meat = breakfastFactory.createMeat();
        Garnish garnish = breakfastFactory.createGarnish();

        System.out.println("Creating breakfast");
        meat.print();
        garnish.print();
    }
}
