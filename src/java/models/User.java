/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Jeramie R
 */
public class User {
    public String username;

        public User(String username, String password) {
            this.username = username;
            password = null;

        }
        public String getUsername() {
            return username;
        }
}
