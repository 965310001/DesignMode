package 桥接模式;

class Street extends AbstractRoad {

    @Override
    void run() {
        super.run();
        aCar.run();
        System.out.println("在市区街道行驶");
    }

}