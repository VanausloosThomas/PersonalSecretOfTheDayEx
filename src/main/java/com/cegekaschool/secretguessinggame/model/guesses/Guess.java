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



}
