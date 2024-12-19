import java.util.Scanner;

public class Magaz {
    Scanner scanner = new Scanner(System.in);
    Trader trader = new Trader();

    public void buy(){
        trader.speakTrader();
        System.out.println(" У вас в наличии " + Game.hero.gold + " золотых монет ");
        System.out.println("Вы хотите приобрести зелье....Одно лекарство стоит 20 золотых. Введите количество лекарств которое вам нужно ");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Введите натуриальное число");
        }


        int pointbuy = scanner.nextInt();
        if (pointbuy < trader.potion && 0 < pointbuy && pointbuy * 20 <= Game.hero.gold){
            trader.potion = trader.potion - pointbuy;
            Game.hero.gold = Game.hero.gold - pointbuy * 20;
            Game.hero.potion = Game.hero.potion + pointbuy;
            System.out.println("Спасибо за покупку " + Game.hero.name + ", у вас имеется " + Game.hero.potion + " лекарства " + " и " + Game.hero.gold + " золотых монет ");
        }else {
            System.out.println("Введено неверно значение, у вас не хватает золотых");
        }

        Game.opTion();




    }

}
