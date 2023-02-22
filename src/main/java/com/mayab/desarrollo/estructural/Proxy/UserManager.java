package com.mayab.desarrollo.estructural.Proxy;

public class UserManager {
    private String currentUser;

    public UserManager(String currentUser) {
        this.currentUser = currentUser;
    }

    public UserManager(boolean b) {
    }

    public User getCurrentUser() {
        if (currentUser.equals("superuser")) {
            return new SuperUser();
        } else {
            return new RegularUser();
        }
    }

    public static User getCurrentUser(String currentUser) {
        return null;
    }

    private class RegularUser implements User {
        public boolean isSuperUser() {
            return false;
        }
    }

    private class SuperUser implements User {
        public boolean isSuperUser() {
            return true;
        }
    }
}


