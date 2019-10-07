public class Runtrack implements Obstruction {
    private int dist;
    private String name;

    public Runtrack(int dist, String name) {
        this.dist = dist;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Running track distance is " + dist);
    }

    public boolean doRun(Competititors competitor){
        int runDist = competitor.run();
        return runDist >= dist;
    }

    @Override
    public String name() {
        return this.name;
    }
}
