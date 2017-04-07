package 桥接模式;

class Car extends AbstractCar{

    @Override  
    void run() {
        super.run();  
        System.out.print("小汽车");  
    }  
}  