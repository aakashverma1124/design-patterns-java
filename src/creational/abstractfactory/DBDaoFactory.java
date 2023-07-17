package creational.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("emp")) {
            dao = new DBEmployeeDao();
        } else if(type.equals("dept")) {
            dao = new DBDepartmentDao();
        }
        return dao;
    }
}
