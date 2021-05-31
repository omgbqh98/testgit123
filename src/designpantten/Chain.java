package designpantten;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chain {
    public List<Command> commands;

    public Chain(Command... commands) {
        this.commands = Arrays.asList(commands);
    }

    public void start(Object context) {
        for (Command command : commands) {
            boolean shouldStop = command.execute(context);

            if (shouldStop) {
                return;
            }
        }
    }


    public static void main(String[] args) {
        Chain chain = new Chain(new FirstCommand(), new SecondCommand());
        Map<String, Object> context = new HashMap<>();
        context.put("some parameter", "some value");
        chain.start(context);
    }
}
