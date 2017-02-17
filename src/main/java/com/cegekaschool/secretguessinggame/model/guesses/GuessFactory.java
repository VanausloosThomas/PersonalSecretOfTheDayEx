package com.cegekaschool.secretguessinggame.model.guesses;

import com.cegekaschool.secretguessinggame.model.pineapples.Pineapple;

/**
 * Created by thomasva on 17/02/2017.
 */
public class GuessFactory {


    public Guess createGuess(Pineapple voter, Pineapple votee) {

        return new Guess(voter,votee);
    }
}
