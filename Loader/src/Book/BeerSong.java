package Book;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottle(bottles)";
        while (beerNum > 0) {
            if (beerNum == 99) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + "beer on the wall");
            System.out.println(beerNum + " " + word + " beer.");
            System.out.println("I'll take one.");
            System.out.println("let it go in a circle");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + "beer on the wall");
            } else {
                System.out.println("No beer bottles on the wall");
            }

        }
    }
}