package org.sid.demo1.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class User implements Serializable
{
    @Id private String username;

    
    @JsonIgnore
    private String password;
    private boolean active = false;

    

    public User() {}

    public User(String username, String password, Boolean active) {
        super();
        this.username = username;
        this.password = password;
        this.active = active;
    }



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



    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() { return username; }
}
