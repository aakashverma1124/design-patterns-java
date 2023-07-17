## Abstract Factory

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

### Example:

Let's say you want to create a functionality where you want to `save` an `Employee` and `Department` into two different sources i.e. `XML` and `Database`.

Here `save` is the functionality that you want to achieve.

Here, `Employee` and `Department` are considered to be `Dao`.

And we will have different concrete classes which will implement `save` method in different ways.

Interface: `Dao` with `save()` method. 
Note: You can have `Employee` and `Department` as a separate two interfaces as well.

Concrete Classes: `XMLEmployeeDao.java`, `XMLDepartmentDao.java`, `DBEmployeeDao.java`, and `DBDepartmentDao.java`. These concrete classes will implement `Dao` interface.

![](https://github.com/aakashverma1124/design-patterns-java/blob/master/assets/AbstractFactoryDao.png)

Now, `DaoAbstractFactory.java` will take the responsibility to return the object of either `XMLDaoFactory.java` or `DBDaoFactory.java`.

And these two classes `XMLDaoFactory.java` and `DBDaoFactory.java` will return the requested object.

![](https://github.com/aakashverma1124/design-patterns-java/blob/master/assets/FactoryProducer.png)

I hope you have understood the pattern and its usecases.


