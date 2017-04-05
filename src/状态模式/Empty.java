package 状态模式;

public class Empty implements State {

    @Override
    public void draw() {
        System.out.println("擦除画板");
    }
}