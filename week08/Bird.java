// Adam Poliak
// 10/27/2022
// Bird class - inherits from Animal class

class Bird extends Animal {

    public Bird(String name, boolean hasHair, int numberLegs, boolean swimable) {
        this.name = name;
        this.hasHair = hasHair;
        this.numberLegs = numberLegs;
        this.swimable = swimable;
    }

    public void locomote() {
        System.out.println("I fly");
    }

    public static void main(String[] args) {
        Animal bird = new Bird("bird", false, 2, true);
        bird.locomote();

        System.out.println(bird.getName());


    }
}
