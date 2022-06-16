package IgraVoprosi;

public class Player {
    int number = 0;

    public void quess() {
        number = (int)  (Math.random() * 10);
        System.out.println("думаю, это число " + number);
    }
}
