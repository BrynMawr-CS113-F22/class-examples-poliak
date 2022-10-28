// Adam Poliak
// 10/27/2022
// Fish class - inherits from Animal class

public class Fish extends Animal {

    public Fish(String name, boolean hasHair, int numLegs, boolean swimable) {
        // this.name = name;
        // this.hasHair = hasHair;
        // this.numberLegs = numLegs;
        // this.swimable = swimable;
        super(); // super indicates that this constructor should call the matching constructor in Animal
    }

    public void locomote() {
        System.out.println("I swim!");
    }
    public static void main(String[] args) {
        //Fish emptyFish = new Fish();
        Fish goldFish = new Fish("goldy", true, 0, true);
        System.out.println(goldFish.getName());
    }

}
