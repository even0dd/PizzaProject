import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        pizzeria();

    }
    public static void pizzeria(){
        boolean piz=true;
        while (piz){
            System.out.println("Which pizza do you prefer?  \n 1) LaFinta\n 2) Margarita\n 3)Pepperoni " );
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("LaFinta");
                    System.out.println("If you want pizza with musrooms, choose - 1, without mushrooms, choose - 2");
                    int choice1 = scan.nextInt();
                    LaFinta laFinta = new LaFinta();
                    laFinta.setWeight(.500);
                    laFinta.setPrice(400);
                    Pizza.Cooking();
                    laFinta.Label();
                    laFinta.Special(choice1);
                    break;

                case 2:
                    System.out.println("Margarita");
                    System.out.println("If you want pizza with meat, choose - 1  without meat, choose - 2");
                    int choice2 = scan.nextInt();
                    Margarita margarita = new Margarita();
                    margarita.setPrice(250);
                    margarita.setWeight(.350);
                    Pizza.Cooking();
                    margarita.Label();
                    margarita.Special(choice2);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("If you want spicy pizza,choose - 1 not spicy, choose - 2");
                    int choice3 = scan.nextInt();
                    Pepperoni pepperoni = new Pepperoni();
                    pepperoni.setPrice(300);
                    pepperoni.setWeight(0.400);
                    Pizza.Cooking();
                    pepperoni.Label();
                    pepperoni.Special(choice3);
                    System.out.println("");
                    break;

                default:
                    System.out.println("Sorry, we don't have this kind of pizza(");

            }
            System.out.println("If you want to order more, press any button\n to exit press -exit- ");
            String pizz = scan.next();
            if(pizz.equals("exit")){
                piz=false;
                System.out.println("All the best! Your order will be delivered within 20 minutes!");
            }

        }
    }
}
