package test.park;

public class Tree extends Plant{

    private String numberOfPlantingTree;

    public Tree(String name, String numberOfPlantingTree) {
        super(name);
        this.numberOfPlantingTree = numberOfPlantingTree;
    }

    @Override
    public String toString() {
        return "Tree{" + " Название деревьев: " + getName() +  "| Количество посаженных деревьев: " + numberOfPlantingTree + '}';
    }
}
