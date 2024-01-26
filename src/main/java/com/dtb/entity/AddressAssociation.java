package com.dtb.entity;

/**
 * @author banglin
 * @version 1.0.0
 * @create 2021/3/24-16:04
 */
public class AddressAssociation extends Address {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
