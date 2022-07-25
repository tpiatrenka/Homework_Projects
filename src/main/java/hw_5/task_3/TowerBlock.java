package hw_5.task_3;

//+- 
public class TowerBlock implements TypesOfBlocksAndHouses {
    //поля класса должны быть private
    int numberOfFloors;
    boolean turnedOnHeating = false;
    int numberOfResidents;

    public TowerBlock(int numberOfFloors, int numberOfResidents) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public int getTheFloor() {
        return numberOfFloors;
    }

    @Override
    public boolean turnOnTheHeating() {
        return turnedOnHeating;
    }

    @Override
    public int getTheNumberOfResidents() {
        return numberOfResidents;
    }
}
