package com.cegekaschool.secretguessinggame.model.guesses;

import com.cegekaschool.secretguessinggame.model.pineapples.Pineapple;

/**
 * Created by Thomas on 22/02/2017.
 */
public class Guess {

    private  Pineapple voter;
    private  Pineapple votee;

    private Guess(Pineapple voter, Pineapple votee) {
        this.voter = voter;
        this.votee = votee;
    }

    public static Guess createGuess(Pineapple voter, Pineapple votee) {

        return new Guess(voter, votee);
    }
}
