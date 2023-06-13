package structural.decorator;

public class Farmhouse implements Pizza {
    @Override
    public int cost() {
        return 150;
    }
}
