public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    public void movingMuscles(){
        System.out.print("muscles moving  ");
    }
    public void backFin(){
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed=="fast"){
            movingMuscles();
            backFin();
        }else{
        movingMuscles();}
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
