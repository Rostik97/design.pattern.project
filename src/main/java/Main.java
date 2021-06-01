import behavioral.mediator.*;
import behavioral.observer.Director;
import behavioral.observer.Observer;
import behavioral.observer.Student;
import behavioral.observer.University;
import behavioral.state.State;
import behavioral.state.TVContext;
import behavioral.state.TVStartState;
import behavioral.state.TVStopState;
import behavioral.strategy.Coding;
import behavioral.strategy.Developer;
import behavioral.strategy.Eating;
import behavioral.template_method.AirPlaneDriver;
import behavioral.template_method.BusDriver;
import behavioral.template_method.Driver;
import creational.abstract_factory.Car;
import creational.abstract_factory.CheepCar;
import creational.abstract_factory.CheepCarFactory;
import creational.buider.Client;
import creational.factory.Cocktail;
import creational.factory.CocktailFactory;
import creational.factory.CocktailType;
import creational.prototype.PrototypeEmployee;
import creational.singleton.Singleton;
import structural.adapter.IceRoadAdapter;
import structural.adapter.Runner;
import structural.bridge.Color;
import structural.bridge.ColorImpl;
import structural.bridge.Shape;
import structural.bridge.Square;
import structural.composite.User;
import structural.decorator.Earth;
import structural.decorator.EarthDecorator;
import structural.decorator.Planet;
import structural.facade.Bus;
import structural.facade.BusFacadeImpl;
import structural.facade.Vehicle;
import structural.flyweight.Employee;
import structural.flyweight.Organization;
import structural.proxy.HeavyWeightObj;
import structural.proxy.HeavyWeightProxy;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Singleton
        System.out.println(" [Singleton] ");
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        //Factory method
        System.out.println(" [Factory method] ");
        Cocktail cocktail = CocktailFactory.getCocktail(CocktailType.SOUR);
        cocktail.shake();
        //Builder
        System.out.println(" [Builder] ");
        Client client = new Client.Builder()
                .withAge(10)
                .withEmail("@gmail.com")
                .withFirstName("Rost")
                .build();
        System.out.println(client.toString());
        //Abstract factory
        System.out.println(" [Abstract factory] ");
        Car car = new CheepCar(new CheepCarFactory());
        System.out.println(car);
        //Prototype
        System.out.println(" [Prototype] ");
        PrototypeEmployee prototypeEmployee = new PrototypeEmployee();
        prototypeEmployee.setAge(10);
        prototypeEmployee.setName("Vasya");
        System.out.println(prototypeEmployee);
        PrototypeEmployee newEmployee = prototypeEmployee.clone();
        System.out.println("New employee: " + newEmployee);
        //Adapter
        System.out.println(" [Adapter] ");
        Runner runner = new Runner(new IceRoadAdapter());
        runner.runOnTheRoad();
        //Composite
        System.out.println(" [Composite] ");
        User user = new User("Petya", 1212, "qwe");
        User newUser = new User("Van", 300, "gym");
        user.addUser(newUser);
        System.out.println(user);
        user.removeUser(newUser);
        System.out.println(user);
        //Proxy
        System.out.println(" [Proxy] ");
        HeavyWeightObj heavyWeightObj = new HeavyWeightProxy();
        heavyWeightObj.processOperation();
        heavyWeightObj.processOperation();
        //Flyweight
        System.out.println(" [Flyweight] ");
        Employee employee = new Employee("Nik", "admin");
        Organization organization = new Organization();
        System.out.println(organization.recruit(employee));
        System.out.println(organization.recruit(employee));
        organization.getEmployee(employee).showInfo();
        //Facade
        System.out.println(" [Facade] ");
        Vehicle vehicle = new Bus();
        BusFacadeImpl busFacade = new BusFacadeImpl(vehicle);
        busFacade.startUseVehicle();
        busFacade.stopUseVehicle();
        //Bridge
        System.out.println(" [Bridge] ");
        Color color = new ColorImpl();
        color.setColor("BLACK");
        Shape shape = new Square();
        shape.drawShape(color);
        //Decorator
        System.out.println(" [Decorator] ");
        Planet planet = new Earth();
        System.out.println(planet.getSize());
        Planet planetDecorator = new EarthDecorator(planet);
        System.out.println(planetDecorator.getSize());
        //Template method
        System.out.println(" [Template method] ");
        Driver driver = new BusDriver();
        driver.driveCarTemplateMethod();
        driver = new AirPlaneDriver();
        driver.driveCarTemplateMethod();
        //Mediator
        System.out.println(" [Mediator] ");
        TextChat chat = new TextChat();
        ChatUser admin = new Admin(chat);
        ChatUser user1 = new CommonChatUser(chat);
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.sendMsg("Hey!", user1);
        //Observer
        System.out.println(" [Observer] ");
        University university = new University();
        Observer director = new Director();
        university.setObserver(director);
        university.addStudent(new Student("Vasyan"));
        university.addStudent(new Student("Ivan"));
        //Strategy
        System.out.println(" [Strategy] ");
        Developer developer = new Developer(new Coding());
        developer.executeActivity();
        developer.setActivity(new Eating());
        developer.executeActivity();
        //State
        System.out.println(" [State] ");
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();
        context.setState(tvStartState);
        context.doAction();
        context.setState(tvStopState);
        context.doAction();
    }
}
