package 策略模式;

/**
 * Created by wd on 2017/4/5.
 */
public class Environment {

    private Strategy strategy;

    public enum StrategyType {
        ADD(0), MULT(1), SUB(2);

        int index;

        StrategyType(int index) {
            this.index = index;
        }
    }

    public Environment(StrategyType type) {
        switch (type) {
            case ADD:
                strategy = new AddStrategy();
                break;

            case MULT:
                strategy = new MultiplyStrategy();
                break;

            case SUB:
                strategy = new SubtractStrategy();
                break;

            default:
                strategy = new AddStrategy();
                break;
        }
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }
}
