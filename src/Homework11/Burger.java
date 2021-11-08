package Homework11;

public class Burger {

    public boolean mayonnaise;
    public int meat;

    public Burger(boolean mayonnaise) {
        this.mayonnaise = mayonnaise;
        if (!mayonnaise) {
            System.out.println("Dietary");
        }
        if (mayonnaise) {
            System.out.println("Default");
        }
    }
    public Burger(boolean mayonnaise, int meat){
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        if (meat == 1 && mayonnaise){
            System.out.println("You have default burger. " + toString());
        } else if (meat == 2 && mayonnaise){
            System.out.println("You have burger with double Meat. " + toString());
        } else if (meat == 1 && !mayonnaise){
            System.out.println("You have Dietary Burger. " + toString());
        } else if (meat == 2 && !mayonnaise){
            System.out.println("You have Dietary burger with double meat." + toString());
        } else {
            System.out.println("Sorry, we don't have that type of burger in our menu");
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
        Burger burger = (Burger) obj;
        return this.mayonnaise == burger.mayonnaise && this.meat == burger.meat;
    }

}
