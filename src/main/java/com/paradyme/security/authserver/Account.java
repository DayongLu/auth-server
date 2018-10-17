package com.paradyme.security.authserver;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(schema = "oauth_identity")
public class Account {


    public Account(String username, String password, boolean enable, boolean accountNonExpired, boolean accountNonLocked, boolean credentialsNonExpired, String authorities) {
        this.username = username;
        this.password = password;
        this.enable = enable;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.authorities = authorities;
    }

    public Account() {

    }

    @Id
    @GeneratedValue
    private Long id;
    private String username, password;
    private boolean enable;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private String authorities;


}
