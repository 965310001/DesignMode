package 桥接模式;

class Bus extends AbstractCar{

    @Override  
    void run() {  
        super.run();
        System.out.print("公交车");  
    }  
}  