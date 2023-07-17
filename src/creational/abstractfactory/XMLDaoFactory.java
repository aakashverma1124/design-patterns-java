package creational.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("emp")) {
            dao = new XMLEmployeeDao();
        } else if(type.equals("dept")) {
            dao = new XMLDepartmentDao();
        }
        return dao;
    }
}
