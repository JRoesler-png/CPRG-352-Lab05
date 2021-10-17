/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.User;

/**
 *
 * @author Jeramie R
 */
public class AccountService {

    public User login(String username, String password) {
        if (("abe".equals(username) || "barb".equals(username)) && "password".equals(password)) {
            return new User(username, null);
        }
        return null;
        
    }

    
}
