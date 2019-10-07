public class testCompetition {
    public static void main(String[] args) {

        Competititors[] competititor = new Competititors[3];
        competititor[0] = new Human(50, 5, "Human");
        competititor[1] = new Cat(150, 10, "Cat");
        competititor[2] = new Robot(250, 20, "Robot");

        Obstruction[] obstructions = new Obstruction[3];
        obstructions[0] = new Runtrack(50, "First Running track");
        obstructions[1] = new Wall(5, "Second Wall");
        obstructions[2] = new Wall(20, "Third Wall");


    }
}
