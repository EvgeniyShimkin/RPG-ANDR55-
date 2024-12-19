import java.util.Scanner;

public class Hero extends Features {
    Scanner scanner = new Scanner(System.in);

    public Hero(){
        this.name = scanner.nextLine();
        this.lovkost = 35;
        this.strength = 30;
    }

}
