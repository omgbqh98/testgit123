package designpantten;

import java.util.Map;

public class SecondCommand implements Command<Map<String, Object>> {
    public boolean execute(Map<String, Object> context) {
        //doing something in here
        return true;
    }
}
