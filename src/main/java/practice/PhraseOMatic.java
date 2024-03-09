package practice;

public class PhraseOMatic {
    public static void main(String[] args) {
        //make three sets of words to choose from
        String[] wordListOne = {"tinkerbell", "newspaper", "24/7", "once daily", "2 times", "30th", "300ft", "100 decibels", "newsflash", "medicine 101"};
        String[] wordListTwo = {"baby-shark", "mambo cabana", "3 cups", "dynamic", "team-based", "city", "NYC", "notebook", "assembly", "4 wheel-drive"};
        String[] wordListThree = {"abc 123", "noise", "ambition", "cute panda", "NFL season", "church clothes", "computer", "bug-fixes", "anatomy", "glossary", "go team!", "avocado smoothie"};

        //find out how many words are in each list
        int stringOneSize = wordListOne.length;
        int stringTwoSize = wordListTwo.length;
        int stringThreeSize = wordListThree.length;

        //generate three random numbers
        int randomNumber1 = (int) (Math.random() * stringOneSize);
        int randomNumber2 = (int) (Math.random() * stringTwoSize);
        int randomNumber3 = (int) (Math.random() * stringThreeSize);

        //build a phrase
        String phrase = wordListOne[randomNumber1] + " " + wordListTwo[randomNumber2] + " " + wordListThree[randomNumber3];

        //print out the phrase
        System.out.println("What we need is a " + phrase);

    }
}
