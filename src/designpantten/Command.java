package designpantten;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Command<T>{
    boolean execute(T context);
}

