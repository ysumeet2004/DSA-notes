package ECC_COdes;

import java.util.Scanner;

abstract class CoffeeMachine {

    // This is abstract – must be defined by specific machines
    abstract void selectCoffeeType();

    // These are hidden internal steps – already implemented
    void heatWater() {
        System.out.println("Heating water...");
    }

    void grindBeans() {
        System.out.println("Grinding coffee beans...");
    }

    void pourCoffee() {
        System.out.println("Pouring your coffee...");
    }

    // Template method: defines the high-level process
    void makeCoffee() {
        selectCoffeeType();   // Important, customizable step
        heatWater();          // Hidden, fixed steps
        grindBeans();
        pourCoffee();
        System.out.println("Enjoy your coffee! ☕");
    }
}

class A extends CoffeeMachine
{
    void selectCoffeeType()
    {
        int choice ;
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("[1] Espresso    ----> $10.00");
        System.out.println("[2] Latte       ----> $17.00");
        System.out.println("[3] Hot coffee  ----> $06.50");
        System.out.println("[4] cold coffee ----> $08.00");
        System.out.println("------------------------------");
        choice = sc.nextInt();
    }
    void make()
    {
        makeCoffee();
    }
}
public class Coffee {
    public static void main(String[] args) {
        A obj = new A();
        obj.make();
    }
}
