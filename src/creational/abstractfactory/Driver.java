package creational.abstractfactory;

public class Driver {
    public static void main(String[] args) {

        DaoAbstractFactory daoAbstractFactory = DaoFactoryProducer.produce("xml");
        Dao dao = daoAbstractFactory.createDao("emp");
        dao.save();

        Dao dao2 = daoAbstractFactory.createDao("dept");
        dao2.save();

    }
}
