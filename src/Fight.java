public class Fight  extends Thread {
    int vibor = (int) Math.round(Math.random());
    Features fst = getvst();



    private Features getvst (){
        if (vibor == 0){
            fst = new Goblin();
            System.out.println("Тонко завыл ветер, который со временем становился все сильнее, все нестерпимее, пока не превысил наконец порог слышимости несовершенного человеческого уха. \nИ вскоре из темного леса вышел Гоблин - шмыг.");
            System.out.println("Мимо пройти не получится подумал " + Game.hero.name + " и обнажив своей меч, направился в бой.");
        }else {
            fst = new Skillet();
            System.out.println(" Проходя мимо старого кладбища," + Game.hero.name + " замедлил шаги. Он всегда был заворожен мистической атмосферой этого места, но сегодняшняя ночь придавала ему особый ужас. \nВ этот момент и раздался треск земли откуда появился скилет Гася Докуро.");
            System.out.println("Не пройти, сказал " + Game.hero.name + " и обнажив своей меч, направился в сторону старого кладбища.");
            System.out.println(" "); // поле 1
        }
        return fst;
    }

    @Override
    public void run() {
        while (true) {
            Game.hero.attack();
            fst.hp = (int) (fst.hp - Game.hero.damage);
            System.out.println("У нашего героя " + Game.hero.name + " осталось " + Game.hero.hp + " единиц здоровья ");
            System.out.println(" "); // 1 поле
            if (fst.hp <= 0) {
                break;
            }
            try {
                this.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fst.attack();
            Game.hero.hp = (int) (Game.hero.hp - fst.damage);
            System.out.println("Уровень здоровья нашего героя - " + Game.hero.name + " на уровне " + Game.hero.hp + " единиц, можно продолжить бой ");
            if (Game.hero.hp <= 0) {
                break;
            }
            try {
                this.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (fst.hp <= 0 ){
            Game.hero.gold = Game.hero.gold + fst.gold;
            Game.hero.xp = (int) Game.hero.xp + 10;
            System.out.println(Game.hero.name + " одержал победу над " + fst.name);
            System.out.println("У вас осталось " + Game.hero.hp + " здоровья и ваш непобежденный меч");
            System.out.println("За победу над врагом, вы получил: " + Game.hero.xp + " опыта и немного золотых " + Game.hero.gold);
            Game.opTion();
        } else {
            System.out.println(" Герой " + Game.hero.name + " пал в бою ");

        }
    }
}
