package test.park;

public class Flower extends Plant{

    private String numberOfPlantingFlowers;

    public Flower(String name, String numberOfPlantingFlowers) {
        super(name);
        this.numberOfPlantingFlowers = numberOfPlantingFlowers;
    }

    public String getNumberOfPlantingFlowers() {
        return numberOfPlantingFlowers;
    }

    @Override
    public String toString() {

        return "Flower{" +" Название цветов: " + getName() + "| Количество посаженных цветов: " + numberOfPlantingFlowers + '}';

    }

}
