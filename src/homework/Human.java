package homework;

public class Human implements Competititors {
    private String name;
    private int run;
    private int jump;

    public Human(int run, int jump, String name) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public int run(){
        return this.run;
    }

    public int jump(){
        return this.jump;
    }

    @Override
    public String name() {
        return this.name;
    }

    public void printInfo(){
        System.out.println("homework.Human can run " + run + " and jump " + jump);
    }
}
