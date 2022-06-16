package IgraSCollection;

import java.util.LinkedList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();

        //dobavljaem v spisok rjad elementov
        states.add("Pervii v spiske");
        states.add("Vtoroi v spiske ");
        states.addLast("Tretii v spiske"); //dobavljaem na poslednee mesto
        states.addFirst("T4etvertii v spiske "); //dobavljaem na pervoe  mesto
        states.add(1,"Pjatii v spiske, no s indeksom 1 "); //dobavljaem po indeksy

        System.out.printf(" список имеет %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "dobavili novii element s indekcom 1 ");
            for (String state : states) {
                System.out.println(state);
            }
            //proverka na nalitsie elementa v spiske
         if (states.contains("Pervii v spiske")) {
             System.out.println(" список содержит Pervii v spiske");
         }

         states.remove("Pervii v spiske");
         states.removeFirst(); // ylalenie pervogo elementa
         states.removeLast(); // ylalenie poslednego  elementa

         LinkedList<Person2> people2 = new LinkedList<Person2>();
         people2.add(new Person2("Dobavlaem novyu pervii persony "));
         people2.addFirst(new Person2("Dobavlaem novyu vtoroi  persony"));
         people2.addLast(new Person2("Dobavlaem novyu tretii persony "));
         people2.remove(1); //ydalenie tvorogo elementa

        for (Person2 p : people2) {
            System.out.println(p.getName());
        }
        Person2 first = people2.getFirst();
        System.out.println("    ");
        System.out.println(first.getName()); // vivod pervogo elementa


        }

    }

