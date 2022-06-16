package ProverkaKoda;//public class ProverkaKoda.DooBee {
//    public static void main(String[] args) {
//
//        int x = 1;
//        while (x < 3) { // пока
//            System.out.print("Doo");
//            System.out.print("Bee");
//
//            x = x + 1;
//        }
//
//        if (x==3) { // если
//            System.out.print("Do");
//        }
//    }
//}


//for - для
// else  - иначе
// while - пока
// if - если


//public class ProverkaKoda.DooBee {
//    public static void main(String[] args) {
//
//        int x = 99;
//        String w = "бутылок (бутылки )";
//
//        while (x > 0) { // пока
//
//            if (x == 1) {
//                w = "бутылка ";
//            }
//            else {
//                w = "бутылка "; //добавляет еще строчку
//
//            }
//        System.out.println( x + "  " + w + " пива на стене ");
//            System.out.println( x + "  " + w + " пива  ");
//            System.out.println( " Возьми одну  ");
//            System.out.println(" Пусти по кругу  ");
//            x = x - 1;
//
//            if (x > 0) {
//                System.out.println( x + "  " + w + " пива на стене ");
//            }
//            else {
//                System.out.println(" Нет бутылок пива на стене ");
//            }
//            }
//            }
//        }
//

//public class ProverkaKoda.DooBee {
//    public static void main(String[] args) {
//
//        String[] wordListOne = {
//                "Если Вы проявите инициативу, успех не заставит себя ждать.",
//                "Ваши надежды и планы сбудутся сверх всяких ожиданий.",
//                "Готовьтесь к романтическим приключениям.",
//                "В этом месяце ночная жизнь для вас.",
//                "Вам пора отдохнуть.",
//                "Вам предлагается мечта всей жизни. Скажите да!",
//                "Вас ждет приятный сюрприз.",
//                "Ваши надежды и планы сбудутся сверх всяких ожиданий.",
//                "Время – ваш союзник, лучше отложить принятие важного решения хотя бы на день.",
//                "Время и терпение,  вас ждут много сюрпризов!",
//                "Время осушит все слезы и исцелит все раны."
//        };
//        String[] wordListTwo = {
//                "Внимание! Это сообшение содержит вирус любви! Он находит самого доброго и хорошего человека!",
//                "К осени чувства не ослабнут, а станут сильнее.",
//                "Вас ожидают легкие романтические увлечения.",
//                "Через неделю вас с наскоку поцелует ваша судьба.",
//                "Поцелуй - это то, что вы не можете дать, не взяв, и взять не отдав.",
//                "Для каждого найдется кусочек рая на планете.",
//                "Это виртуальный поцелуй. Прижать к сердцу. Повторить 7 раз."
//        };
//
//        String[] wordListThree = {
//                "Родители замыслили что-то доброе.",
//                "Любимая песня на радио – предвестник удачи.",
//                "К лету ты  подрастешь на 2 см",
//                "Смейся всегда беспечно, чтобы счастье длилось вечно.",
//                "Если в течение 15 секунд не крикнешь УРА!, то все пропало!",
//                "На неделе жди письмо. Уже отправили его.",
//                "Это магическая записка. Она увеличивает силу героя на 6 очков."
//
//        };
//
//        int oneLength = wordListOne.length;
//        int twoLength = wordListTwo.length;
//        int threeLength = wordListThree.length;
//
//        int r1 = (int) (Math.random() * oneLength);
//        int r2 = (int) (Math.random() * twoLength);
//        int r3 = (int) (Math.random() * threeLength);
//
//        String phrase = wordListOne[r1] + " " + wordListTwo[r2] + " " + wordListThree[r3];
//
//        System.out.println(" Завтра для тебя -  " + phrase);
//    }
//}


//public class ProverkaKoda.DooBee {
//    public static void main(String[] args) {
//
//        int x = 0;
//        int y = 0;
//        while (x < 5) {
//
//            y = x - y;
//
//
////            y = y + x;
//
//
////                y = y + 2;
////                if ( y > 4) {
////                    y = y - 1;
////                }
//
//
//
//
////            x = x + 1;
////            y = y + x;
//
//
//
////            if  ( y < 5) {
////                x = x + 1;
////                if (y < 3) {
////                    x= x - 1;
////                }
////            }
////            y = y + 2;
//
//         System.out.print (x + "" + y +" ");
//         x = x + 1;
//        }
//
//
//    }
//}




public class DooBee {
        public static void main (String[] args) {
            int x = 0;

            while (x <4) {
                System.out.print("a");
                if (x< 1){
                    System.out.print(" ");
                }
                    System.out.print("n");

                if (x >1){
                    System.out.print("oyster");
                        x = x +2;

                }
                if (x==1) {
                    System.out.print("noys");
                }
                if (x < 1){
                    System.out.print("oise");
                }
                System.out.println("");
                    x = x + 1;

            }
        }
}





