package 迭代器模式;

/**
 * Created by wd on 2017/4/7.
 */
public class Test {

    public static void main(String[] args) {
        Passenger p1=new Passenger("张飞1");
        Passenger p2=new Passenger("张飞2");
        Passenger p3=new Passenger("张飞3");
        Passenger p4=new Passenger("张飞4");

        Bus bus=new Bus();
        bus.addPassenger(p1);
        bus.addPassenger(p2);
        bus.addPassenger(p3);
        bus.addPassenger(p4);

        Iterator it=bus.iterator();
        while (it.hasNext()){
            String name = ((Passenger)it.next()).getName();
            System.out.println("售票员：" + name + ",请买票！");
            System.out.println(name + "  : 赤壁下...");
            System.out.println("售票员：1 元~");

        }
    }
}
