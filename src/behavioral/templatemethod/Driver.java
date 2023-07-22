package behavioral.templatemethod;

public class Driver {
    public static void main(String[] args) {
        DataRenderer dataRenderer = new XMLDataRenderer();
        dataRenderer.render();
    }
}
