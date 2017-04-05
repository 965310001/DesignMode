package 组合模式;

/**
 * Created by wd on 2017/4/5.
 */
public interface Compose {

    void add(Compose compose);

    void display();
}
