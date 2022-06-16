package Trenirovka;

public class TapeDeskTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck(); // etogo nebilo

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true ) {
            t.recordTape();
        }
    }
}
