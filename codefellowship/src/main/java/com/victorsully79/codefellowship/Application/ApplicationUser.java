package com.victorsully79.codefellowship.Application;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class ApplicationUser implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // Spring Security will require method in repo: findByUserName

    String username;
    String password;
    String firstName;
    String lastName;
    String dateOfBirth;
    String bio;

    public void setUsername(String username){
        this.username = username;

    }

    public void setPassword(String password) {
        this.password = password;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return null;
    }

    @Override
    public String getPassword(){
        return password;

    }

    @Override
    public String getUsername(){
        return username;

    }

    @Override
    public boolean isAccountNonExpired(){
        return true;

    }

    @Override
    public boolean isAccountNonLocked(){
        return true;

    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;

    }

    @Override
    public boolean isEnabled(){
        return true;

    }
}
