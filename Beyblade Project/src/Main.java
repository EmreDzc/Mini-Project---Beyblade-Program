import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Beyblade Program...");
        System.out.println("For quit press the q...");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Which beyblade do you choose?");
            String operation = scanner.nextLine();
            if(operation.equals("q")){
                return;
            } else {
                BeybladeFactory beybladeFactory = new BeybladeFactory();
                Beyblade beyblade = beybladeFactory.produceBeyblade(operation);
if(beyblade == null){
    System.out.println("Please try again...");
}
else{
    beyblade.showInfo();
    beyblade.attack();
    beyblade.bringOutTheMonster();
}
                
            }
        }

    }
}