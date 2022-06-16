package IgraVoprosi;

public class GuessGame {

        Player p1;
        Player p2;
        Player p3;
//        GuessGame  содержит три переменных экземпляра для объектов Player
    public void startGame() {
            p1 = new Player();
            p2 = new Player();
            p3 = new Player();
//     создаем три объекта Player и присваиваем их трем переменным экземпляра
            int quessp1 =0;
            int quessp2 = 0;
            int quessp3 = 0;
//     объявляем три переменные для хранения вариантов от каждого игрока

            boolean p1isRight = false;
            boolean p2isRight = false;
            boolean p3isRight = false;
//объявляем три переменные для хранения правильности или неправильности  ответов  игроков
            int targetNumber = (int) (Math.random() * 10);
            System.out.println("Я угадиваю число от 0 до 9 ...");
// создаем число которое игроки должны угадать
            while (true) {
                    System.out.println("число, которое нужно угадать, - " + targetNumber);
                    p1.quess();
                    p2.quess();
                    p3.quess();
//                    вызываем метод quess()  из каждого объекта Player
                    quessp1 = p1.number;
                    System.out.println("первый игрок думает, что это " + quessp1);

                    quessp2 = p2.number;
                    System.out.println("второй игрок думает, что это "  + quessp2);

                    quessp3 = p3.number;
                    System.out.println("третий игрок думает, что это " + quessp3);
//                    извлекаем варианты каждого игрока (результаты работы их методов quess()
//                    получая доступ к их переменным number )
                    if (quessp1 == targetNumber) {
                            p1isRight = true;
                    }
                    if (quessp2 == targetNumber) {
                            p2isRight = true;
                    }
                    if (quessp3 == targetNumber) {
                            p3isRight = true;
//                            proverjaem variatti kazdogo is igrokov na sootvetstvie sagadonomy 4isly
//                            esli igrok ygadal to prisvaivsem soorvetstvys4ei peremennoi snathenie true
//                            (pomnite sto po ymol4aniy ona xranit snathenie false)
                    }

                    if (p1isRight || p2isRight || p3isRight) {     // esli pervii vtoroi ili tretii igrok ygadal
                            // ( operator || osnathaet ili )
                            System.out.println("у нас есть победитель!!!!");
                            System.out.println("первый игрок угадал? " + p1isRight);
                            System.out.println("второй игрок угадал? " + p2isRight);
                            System.out.println("третий  игрок угадал? " + p3isRight);
                            System.out.println("конец игры.");
                            break;
                    } else {

                            System.out.println("игроки должны попробовать еще раз"); //  inathe ostavljaem v
                            // tsikle i prosim sdelat es4e odnu popitky
                    }
            }
    }
}
