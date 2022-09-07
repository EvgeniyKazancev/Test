package All;

public class Solution {

    public static void main(String[] args) {
        Orange orange = new Orange();

        orange.addPrice(50, 1);
        Orange orange1 = new Orange();
        orange1.addPrice(50, 2);
        System.out.println("Total cost: " + Orange.orangePrice);

    }

    public static class Orange {
        public static int orangePrice = 0;

        public void addPrice(int price, int count) {
            // write your code here
            orangePrice += price * count;

        }

    }
}

