package IgraSCollection;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();
//        dobavim v spisoc rjad elementov

        people.add("Tom");
        //bob   posle set zamenjaetsa na Robert
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // dobavljaem element po index 1

        System.out.println(people.get(1));//poly4aem 2 obekt
        people.set(1, "Robert"); // ystanovka novovkgo sna4enija dlja 2 go obekta

        System.out.printf("ArrayList has %d elements \n", people.size());
        System.out.println("     ");
        for (String person : people) { //dja spiska peapele
            // berem elementi i prisvaivaem kazdii v peremennyu person
            System.out.println(person);
        }

        System.out.println("     ");
        //proverjaem nalitsestvo elementov
        if (people.contains("Tom")) {  //esli spisoc sode4it text TOM
            // vivodim text
            System.out.println("ArrayList contains Tom");
        }

        // ydalim neskolko objekvov
        //ydalenie konkretnogo elementa

        people.remove("Robert");

        //ydalenie no indeksy

        people.remove(0);

        Object [] peopleArray = people.toArray(); // spisok people  prevras4aem v massiv (Array)
            // i prisvaivaev v peremennyu peapleArray

        for (Object person : peopleArray) {
            System.out.println(person);
        }
    }
}
