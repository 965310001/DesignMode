package 迭代器模式;

/**
 * Created by wd on 2017/4/7.
 */
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean hasNext();

    public abstract Object current();

}
