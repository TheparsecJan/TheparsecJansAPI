package de.theparsecjanapi.registry;

/**
 * @author Jannis Vogel
 */
public interface Registry<T extends Registerable> {

    void register(T object);
}
