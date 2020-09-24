package com.avalon.Entity;

public class Apply {
    private String username;
    private String password;




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Apply() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Apply(String name1, String password1) {
        // TODO Auto-generated constructor stub
        this.username = name1;
        this.password = password1;
    }


    @Override
    public String toString() {
        return "Apply [username=" + username + ", password=" + password + "]";
    }

}
