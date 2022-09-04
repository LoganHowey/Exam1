public class Insect extends Animal{
    private boolean hasAntennas;
    private String typeOfInsect;

    public Insect(boolean canMove, boolean eatsFood) {
        super(canMove, eatsFood);
    }


    public boolean isHasAntennas() {
        return hasAntennas;
    }

    public void setHasAntennas(boolean hasAntennas) {
        this.hasAntennas = hasAntennas;
    }

    public String getTypeOfInsect() {
        return typeOfInsect;
    }

    public void setTypeOfInsect(String typeOfInsect) {
        this.typeOfInsect = typeOfInsect;
    }

    public void printInfo(){

    }
}
