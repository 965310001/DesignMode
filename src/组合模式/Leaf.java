package 组合模式;

/**
 * Created by wd on 2017/4/5.
 */
public class Leaf implements Compose {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Compose compose) {
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
