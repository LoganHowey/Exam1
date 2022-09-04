public class Cat implements Animal{

    private boolean canMeow;
    private boolean canPurr;

    @Override
    public void eat() {

    }

    @Override
    public void travel() {

    }

    public boolean isCanMeow() {
        return canMeow;
    }

    public void setCanMeow(boolean canMeow) {
        this.canMeow = canMeow;
    }

    public boolean isCanPurr() {
        return canPurr;
    }

    public void setCanPurr(boolean canPurr) {
        this.canPurr = canPurr;
    }
}
