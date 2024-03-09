package game;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String message = "bottles";

        while (beerNum > 0) {

            System.out.println(beerNum + " " + message + " of beer on the wall");
            System.out.println(beerNum + " " + message + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                message = "bottle";

            } else if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall");
            }


        }
        }
    }
