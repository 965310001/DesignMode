package 迭代器模式;

/**
 * Created by wd on 2017/4/7.
 */

/**
 * 售票员，具体的迭代器
 */
public class Conductor extends Iterator {

    private Bus bus; // 具体的聚合对象
    private int current=0; //记录当前位置

    public Conductor(Bus bus) {
        this.bus = bus;
    }

    @Override
    public Object first() {
        return bus.getPassenger(0);
    }

    @Override
    public Object next() {
        if (current >= bus.count()) {
            return null;
        }
        return bus.getPassenger(current++);
//        return bus.getPassenger(current);
    }

    @Override
    public boolean hasNext() {
        return current < bus.count();
    }

    @Override
    public Object current() {
        return bus.getPassenger(current);
    }

}
