package Homework11;

public class Test {

    public boolean mayonnaise;
    public int meat;



    public Test() {
        System.out.println("Greetings! Which burger do you want to eat&");
    }

    public Test(boolean mayonnaise) {
        this.mayonnaise = mayonnaise;
        if (!mayonnaise) {
            System.out.println("Dietary");
        }
        if (mayonnaise) {
            System.out.println("Default");
        }
    }
    public Test(boolean mayonnaise, int meat){
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        if (meat == 1 && mayonnaise){
            System.out.println("You have default burger. ");
        }
        if (meat == 2 && mayonnaise){
            System.out.println("You have burger with double Meat. ");
        }
        if (meat == 1 && !mayonnaise){
            System.out.println("You have Dietary Burger. ");
        }
        if (meat == 2 && !mayonnaise){
            System.out.println("You have Dietary burger with double meat.");
        }

    }
    @Override
    public String toString() {
        if (mayonnaise){
            return "Your burger contains cheese, greens, buns, mayonnaise and " + this.meat + " pieces of meat. Bon Appetit!";
        } else {
            return "Your burger contains cheese, greens, buns, "  + this.meat + " pieces of meat and no mayonnaise. Bon Appetit!" ;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Burger)) {
            return false;
        }
        if(this == obj){
            System.out.println("Kaif");
        }
        Burger burger = (Burger) obj;
        return this.mayonnaise == burger.mayonnaise && this.meat == burger.meat;
    }

}

