package creational.abstractfactory;

public class XMLDepartmentDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Department to XML File.");
    }
}
