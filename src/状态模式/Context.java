package 状态模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wd on 2017/4/5.
 */
public class Context {

    private Map<String, State> map = new HashMap<String, State>();

    private State toolState;

    public void addState(String name, State state) {
        map.put(name, state);
    }

    // 改变状态
    public void selectState(String name) {
        toolState = map.get(name);
    }

    // 执行具体的动作
    public void action() {
        toolState.draw();
    }
}
