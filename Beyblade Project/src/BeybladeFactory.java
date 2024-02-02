public class BeybladeFactory {

    public Beyblade produceBeyblade(String typeOfBeyblade) {
        if (typeOfBeyblade.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Blue Dragon", "speaking the monster");
        } else if (typeOfBeyblade.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "The Red Phoenix");
        } else if (typeOfBeyblade.equals("Drayga")) {
            return new Dranza("Rei", 800, 250, "White Tiger");
        } else if (typeOfBeyblade.equals("Draciel")) {
            return new Dranza("Max", 400, 1000, "Black Turtle");
        } else {
            return null;
        }
    }
}