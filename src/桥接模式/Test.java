package 桥接模式;

/**
 * Created by wd on 2017/4/6.
 */
public class Test {

    public static void main(String[] args) {
        AbstractRoad street=new Street();
        street.aCar=new Car();
        street.run();
    }

}
