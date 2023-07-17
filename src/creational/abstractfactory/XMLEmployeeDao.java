package creational.abstractfactory;

public class XMLEmployeeDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Employee to XML File.");
    }
}
