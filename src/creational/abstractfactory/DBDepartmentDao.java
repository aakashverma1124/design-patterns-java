package creational.abstractfactory;

public class DBDepartmentDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Department to Database.");
    }
}
