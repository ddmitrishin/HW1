package homework;

public class testCompetition {
    public static void main(String[] args) {

        Competititors[] competititor = new Competititors[3];
        competititor[0] = new Human(50, 5, "homework.Human");
        competititor[1] = new Cat(150, 10, "homework.Cat");
        competititor[2] = new Robot(250, 20, "homework.Robot");

        Obstruction[] obstructions = new Obstruction[3];
        obstructions[0] = new Runtrack(50, "First Running track");
        obstructions[1] = new Wall(5, "Second homework.Wall");
        obstructions[2] = new Wall(20, "Third homework.Wall");


    }
}
