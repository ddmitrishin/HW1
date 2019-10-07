public class Cat implements Competititors {
    private String name;
    private int run;
    private int jump;

    public Cat(int run, int jump, String name) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int run() {
        return this.run;
    }

    @Override
    public int jump() {
        return this.jump;
    }

    @Override
    public String name() {
        return this.name;
    }

    public void printInfo(){
        System.out.println("Cat can run " + run + " and jump " + jump);
    }
}
