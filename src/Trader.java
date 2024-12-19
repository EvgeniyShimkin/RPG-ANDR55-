public class Trader extends Features {
    public Trader(){
        this.name = "Mr.Brooks";
        this.potion = 10;
        this.gold = 450;
    }
    void speakTrader(){
        System.out.println("Меня зовут " + this.name +", надеюсь вы меня узнали, хи-хи");
    }
}
