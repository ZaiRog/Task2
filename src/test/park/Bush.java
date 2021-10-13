package test.park;

public class Bush extends Plant{

    private String numberOfPlantingBush;

    public Bush(String name, String numberOfPlantingBush) {
        super(name);
        this.numberOfPlantingBush = numberOfPlantingBush;
    }

    public String getNumberOfPlantingBush() {
        return numberOfPlantingBush;
    }

    @Override
    public String toString() {

        return "Bush{" + " Название кустов: " + getName() + "| Количество посаженных кустов: " + numberOfPlantingBush + '}';
    }
}
