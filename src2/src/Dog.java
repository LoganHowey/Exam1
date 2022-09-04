public class Dog implements Animal{

    private boolean canBark;
    private boolean canPoop;

    @Override
    public void eat() {

    }

    @Override
    public void travel() {

    }


    public boolean isCanBark() {
        return canBark;
    }

    public void setCanBark(boolean canBark) {
        this.canBark = canBark;
    }

    public boolean isCanPoop() {
        return canPoop;
    }

    public void setCanPoop(boolean canPoop) {
        this.canPoop = canPoop;
    }
}
