package DelalaHuman;

public class Human {

    String name;
    Human (String t){
        name = t;

    }
    public static void pacosti1 (String args) {

        System.out.println( args );
    }
    public void pacosti2 (String args) {
        System.out.println(name + args + " Привет");


    }
}
