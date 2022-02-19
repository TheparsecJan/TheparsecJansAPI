package de.theparsecjanapi.util;

import lombok.Getter;

/**
 * @author Jannis Vogel
 */
public class Identifier {

    @Getter private String namespace;
    @Getter private String key;

    public Identifier(String namespace, String key) {
        this.namespace = namespace;
        this.key = key;
    }
}
