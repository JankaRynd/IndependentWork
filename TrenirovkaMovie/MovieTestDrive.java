package TrenirovkaMovie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = " film pervii";
        one.genre = "tragedija";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "film pod nomerom dva ";
        two.genre = "komedija";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "film pod nomerom tri";
        three.genre = "tragedija no veselaja ";
        three.rating = 127;
    }
}
