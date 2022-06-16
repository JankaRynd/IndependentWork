package IgraSCollection;

import java.util.ArrayDeque;

public class Program1 {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();


        //standsrtnoe dobavlenie elementov
        states.add("Germany");
        states.addFirst("France");//dobavljaem element v samoe na4alo 0
        states.push("Great Britain"); // dobavljaem element v samoe na4alo
        states.addLast("Spain");// dobavljaem element v konets kollektsii
        states.add("Italy");

        // poly4aem pervii element bez ydalenija
        String sFirst = states.getFirst(); // poly4aetsa pervii elent spiska
        //i prisvaevaetsja sFirst

        System.out.println(sFirst); //great Britain


        // poly4aem poslednii element bez ydalenija
        String sLast = states.getLast(); //dat poslednii element
        System.out.println(sLast); //Italy

        System.out.printf("Razmer o4eredi : %d\n", states.size()); // 5

        //perebor kollektsii
        while (states.peek() !=null) {
            //isvle4enie s na4ala
            System.out.println(states.pop());
        }

        //o4ered iz obektov Person
        ArrayDeque<Person> people = new ArrayDeque<>();


        people.addLast(new Person("Nick"));
        people.add(new Person("Vasja "));
        people.addFirst(new Person ("Tom"));


        // perebor bes izvle4enii

        for (Person p : people){
            System.out.println(p.getName ());
        }

    }
}
