package de.theparsecjanapi.registry;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jannis Vogel
 */
public class SimpleRegistry<T> implements Registry<T>{

    private final List<T> items;

    public SimpleRegistry() {
        items = new ArrayList<>();
    }

    @Override
    public void register(T item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    @Override
    public void unregister(T item) {
        items.remove(item);
    }
}
