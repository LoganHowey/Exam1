public class Bird extends Animal{

    private boolean canFly;

    public Bird(boolean canMove, boolean eatsFood) {
        super(canMove, eatsFood);
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void printInfo(){

    }
}
