// Adam Poliak
// 10/27/2022
// Zoo class - demonstrates how we can treat all children classes the same

class Zoo {

    public static void main(String[] args) {
        Fish catfish = new Fish("Catfish", false, 0, true);
        Animal hummingbird = new Bird("Hummingbird", false, 2, true);
        Animal human = new Animal("Human", true, 2, true);

        Animal[] myAnimals = {catfish, hummingbird, human};
        for (int i = 0; i < myAnimals.length; i++) {
            System.out.printf("Hi, my name is %s, and ", 
                                myAnimals[i].getName());
            myAnimals[i].locomote();
        }
    }
}
