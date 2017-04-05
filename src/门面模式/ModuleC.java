package 门面模式;

/**
 * Created by wd on 2017/4/5.
 */
class ModuleC implements Moudule {

    @Override
    public void test() {
        System.out.println(this.getClass().getName());
    }
}
