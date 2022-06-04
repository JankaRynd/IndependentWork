public class Main {
    public static void main(String[] args) {

        String p = ListPacostei.ПАКОСТЬ_1.toString();
        Human.pacosti1(p);

        Human human = new Human("Имя ");
        String t = ListPacostei.ПАКОСТЬ_2.toString();
        human.pacosti2(t);

        Human human1 = new Human("Человек  ");
        human1.pacosti2(t);
        human.pacosti2(t);
        for (ListPacostei pacostei: ListPacostei.values())
        switch (pacostei) {
            case ПАКОСТЬ_1:
                System.out.println("Не сделать чай!");
                break;
            case ПАКОСТЬ_4:
                System.out.println("Не выносить мусор!");
                break;
            case ДЕЛАТЬ_ДОБРО:
                System.out.println(" Приносить ЗП !!!!");
                break;
        }

    }
}
