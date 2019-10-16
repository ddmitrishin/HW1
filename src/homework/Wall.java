package homework;

public class Wall implements Obstruction {
    private int height;
    private String name;

    public Wall(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("homework.Wall height " + height);
    }

    public boolean doJump(Competititors competitor){
        int jumpHeight = competitor.jump();
        return jumpHeight >= height;
    }

    @Override
    public String name() {
        return this.name;
    }
}
