package 门面模式;

/**
 * Created by wd on 2017/4/5.
 */
public class Facade {

    private Moudule moduleA, moduleB, moduleC;

    public Facade() {
        moduleA = new ModuleA();
        moduleB = new ModuleB();
        moduleC = new ModuleC();
    }

    public void testA() {
        moduleA.test();
    }

    public void testB() {
        moduleB.test();
    }

    public void testC() {
        moduleC.test();
    }
}
