package com.cegekaschool.secretguessinggame.model.guesses;

import com.cegekaschool.secretguessinggame.model.pineapples.Pineapple;

/**
 * Created by thomasva on 17/02/2017.
 */
public class Guess {

    Pineapple voter;
    Pineapple votee;

    protected Guess(Pineapple voter, Pineapple votee) {
        this.voter = voter;
        this.votee = votee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guess guess = (Guess) o;

        //We take only the voter into account! => the same voter should not have two guesses!
        return voter.equals(guess.voter);

    }

    @Override
    public int hashCode() {
        //We take only the voter into account! => the same voter should not have two guesses!
        return voter.hashCode();
    }
}
