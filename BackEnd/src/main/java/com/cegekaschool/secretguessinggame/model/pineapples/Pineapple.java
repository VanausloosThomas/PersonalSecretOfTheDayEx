package com.cegekaschool.secretguessinggame.model.pineapples;

import com.cegekaschool.secretguessinggame.model.guesses.Guess;
import com.cegekaschool.secretguessinggame.model.secrets.Secret;

/**
 * Created by thomasva on 17/02/2017.
 */
public class Pineapple {

    private String name;
    private String password;
    private Secret secret;
    private Pineapple guess;


    protected Pineapple(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return new String(name);
    }

    public String getPassword(){
        return new String(password);
    }
    public Secret getSecret() {
        return secret;
    }

    public void addSecret(Secret secret){
        this.secret = secret;
    }

    public Pineapple getGuess(){
        return guess;
    }

    public  void setGuess(Pineapple guess){
        this.guess = guess;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pineapple pineapple = (Pineapple) o;

        if (!name.equals(pineapple.name)) return false;
        return secret.equals(pineapple.secret);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + secret.hashCode();
        return result;
    }
}
