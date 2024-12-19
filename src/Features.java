public abstract class Features {
    String name;
    int hp;
    int xp;
    int gold;
    int lovkost;
    int strength;
    int damage;
    int potion;

    public Features() {
        this.name = null;
        this.xp = 0;
        this.hp = 100;
        this.gold = 50;
        this.lovkost = 0;
        this.strength = 0;
        this.potion = 0;
    }

    public void attack() {
        int fightL = (int) (Math.random() * 100);
        if (xp >= fightL) {
            damage = (int) (strength * 2);
            System.out.println("Е-ее-е " + name + " выдал крит " + damage);
        } else if ((lovkost * 3) > fightL) {
            damage = lovkost;
            System.out.println("Игрок " + name + " ударил с силой равной " + damage + "- ти" );
        } else {
            damage = 0;
            System.out.println(name + " нанес удар, но промахнулся");
        }
    }
}
