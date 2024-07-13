package MPP.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance;
    private MySingletonLazy() {}
    public static MySingletonLazy getInstance() {
        return Optional.ofNullable(instance)
                .orElseGet(() -> {
                    instance = new MySingletonLazy();
                    return instance;
                });
    }
}
