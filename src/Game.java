import java.util.Scanner;

public class Game {
    static  Hero hero;


    public static void main(String[] args) {
        soznHero();
        opTion();
    }

    static void soznHero() {
        System.out.println("Добро пожаловать в наш мир!");
        System.out.println("Для начала, давайте познакомимся. Введите имя вашего героя ");
        hero = new Hero();
        System.out.println(" Отлично " + hero.name + ", пора идти в путь ");
    }
    static void opTion(){

        System.out.println("Куда вы хотите отправиться ? ");
        System.out.println("1. К торговцу\n" +
                "2. В тёмный лес\n" +
                "3. На выход \n");
        Scanner scanner = new Scanner(System.in);
        int vibor = scanner.nextInt();

        switch (vibor){
            case 1:
                System.out.println(" Отпраляемся к торговцу ");
                Magaz magaz = new Magaz();
                magaz.buy();
                break;
            case 2:
                System.out.println(" Отправляемся в темный лес ");
                Fight fight = new Fight();
                fight.start();
                break;
            case 3:
                System.out.println(" Выходим из игры ");
                break;

            default:
                System.out.println("Введенное значение отсутствует ");
        }
    }
}




