package 享元模式;

/**
 * Created by wd on 2017/4/7.
 */
public class Test {

    public static void main(String[] args) {
        int extrinsicstates = 1;
        FlywightFactory factory = new FlywightFactory();
        Flyweight fx = factory.GetFlyweight("X");
        fx.Operation(extrinsicstates);

        Flyweight fy = factory.GetFlyweight("Y");
        fy.Operation(++extrinsicstates);

        Flyweight fz = factory.GetFlyweight("Z");
        fz.Operation(++extrinsicstates);

        Flyweight fs = factory.GetFlyweight("S");
        fs.Operation(++extrinsicstates);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.Operation(++extrinsicstates);
    }
}
