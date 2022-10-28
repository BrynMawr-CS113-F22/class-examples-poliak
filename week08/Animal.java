// Adam Poliak
// 10/27/2022
// Base animal class - Inheritance example


class Animal {

    protected boolean hasHair;
    protected int numberLegs;
    protected String name;
    protected boolean swimable; // can it swim or not

    // empty constructor
    public Animal() {
        this.hasHair = false;
        this.numberLegs = 0;
        this.name = "No named animal";
        this.swimable = true;
    }

    //     public Bird(String name, boolean hasHair, int numberLegs, boolean swimable) {

    public Animal(String name, boolean hasHair, int numberLegs, boolean swimable) {
        this.hasHair = hasHair;
        this.numberLegs = numberLegs;
        this.name = name;
        this.swimable = swimable;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumLegs() {
        return this.numberLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numberLegs = numLegs;
    }



    // implement accessors and getters


    public void locomote() {
        System.out.println("I locomote");
    }
    public static void main(String[] args) {
        Animal emptyAnimal = new Animal();
        emptyAnimal.locomote();
    }
}
