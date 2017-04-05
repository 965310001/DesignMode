package 状态模式;

/**
 * Created by wd on 2017/4/5.
 */
public class Circle implements State {

    @Override
    public void draw() {
        System.out.println("画出一个圆");
    }
}