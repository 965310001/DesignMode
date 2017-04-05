package 策略模式;

/**
 * Created by wd on 2017/4/5.
 */
class AddStrategy implements Strategy {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
