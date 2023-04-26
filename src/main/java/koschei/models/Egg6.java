package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private final Needle7 needl;

    @Autowired
    public Egg6(Needle7 needl) {
        this.needl = needl;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needl.toString();
    }
}
