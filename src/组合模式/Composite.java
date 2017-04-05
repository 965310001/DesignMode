package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wd on 2017/4/5.
 */
public class Composite implements Compose {

    private String name;

    private List<Compose> list;

    public Composite(String name) {
        this.name = name;
        list = new ArrayList<Compose>();
    }

    @Override
    public void add(Compose compose) {
        list.add(compose);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Compose compose : list) {
            compose.display();
        }
    }
}
