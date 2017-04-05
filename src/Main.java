import 状态模式.Circle;
import 状态模式.Context;
import 状态模式.Empty;
import 状态模式.Line;
import 策略模式.Environment;
import 组合模式.Compose;
import 组合模式.Composite;
import 组合模式.Leaf;
import 门面模式.Facade;

public class Main {

    public static void main(String[] args) {
        /**
         * 门面模式
         */
        Facade facade = new Facade();
        facade.testA();
        facade.testC();
        facade.testB();

        /**
         * 策略模式
         */
        Environment environment = new Environment(Environment.StrategyType.ADD);
        System.out.println(environment.calculate(4, 45));

        environment = new Environment(Environment.StrategyType.SUB);
        System.out.println(environment.calculate(4, 45));

        /**
         * 组合模式
         */
        Compose book = new Composite("白雪公主");
        Compose bookNone = new Composite("第一章");
        bookNone.add(new Leaf("第一节"));
        bookNone.add(new Leaf("第二节"));
        bookNone.add(new Leaf("第三节"));
        book.add(bookNone);
        book.display();


        /**
         * 状态模式
         */
        Context tool=new Context();
        tool.addState("line", new Line());
        tool.addState("circle",new Circle());
        tool.addState("empty", new Empty());
        tool.selectState("line");
        tool.action();
        tool.selectState("empty");
        tool.action();
        tool.selectState("circle");
        tool.action();
    }
}
