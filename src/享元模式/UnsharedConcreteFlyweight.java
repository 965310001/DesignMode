package 享元模式;

class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void Operation(int extrinsicstates) {
        System.out.println("不共享的Flyweight : " + extrinsicstates);
    }
}