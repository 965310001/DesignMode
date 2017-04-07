package 享元模式;

class ConcreteFlyweight extends Flyweight {
    @Override
    public void Operation(int extrinsicstates) {
        System.out.println("共享的Flyweight : " + extrinsicstates);
    }
}