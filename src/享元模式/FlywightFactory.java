package 享元模式;

import java.util.Hashtable;

class FlywightFactory {
    private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();
    
    public FlywightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }
    
    public Flyweight GetFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key,new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }
}