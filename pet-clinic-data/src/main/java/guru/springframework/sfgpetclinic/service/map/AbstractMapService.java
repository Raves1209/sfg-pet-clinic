package guru.springframework.sfgpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID Id) {
        return map.get(Id);
    }

    T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(i -> i.getValue().equals(object));
    }
}
