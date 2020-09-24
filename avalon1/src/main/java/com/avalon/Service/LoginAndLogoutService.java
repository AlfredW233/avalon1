package com.avalon.Service;

public interface LoginAndLogoutService {
    public boolean login(String username, String password);

    public boolean logout(String username);

}
