package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wd on 2017/4/7.
 */
public class Bus extends Aggregate {

    List<Passenger> passengers=new ArrayList<Passenger>();

    @Override
    public Iterator iterator() {
        return new Conductor(this);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void removePassenger(){
        passengers.remove(0);
    }

    public int count(){
        return passengers.size();
    }

    public Passenger getPassenger(int index){
        return passengers.get(index);
    }
}
