package com.zanox.rabbitordering.core;

import com.zanox.rabbiteasy.cdi.ContainsId;

/**
 * @author christian.bick
 */
public class OrderCreatedEvent implements ContainsId<String> {

    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
