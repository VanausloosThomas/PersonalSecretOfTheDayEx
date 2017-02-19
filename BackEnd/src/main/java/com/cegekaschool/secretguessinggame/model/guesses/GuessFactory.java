package com.cegekaschool.secretguessinggame.model.guesses;

import com.cegekaschool.secretguessinggame.model.exceptions.InvalidGuessException;
import com.cegekaschool.secretguessinggame.model.pineapples.Pineapple;

/**
 * Created by thomasva on 17/02/2017.
 */

public class GuessFactory {


    public Guess createGuess(Pineapple voter, Pineapple votee)throws InvalidGuessException {

        validateValues(voter, votee);
        return new Guess(voter,votee);

    }

    private void validateValues(Pineapple voter, Pineapple votee){
        if(voter == null || votee == null){
            throw new InvalidGuessException("Your vote does not contain any value!");
        }
        if(voter.getName().equals("") || votee.getName().equals("")) {
            throw new InvalidGuessException("Your vote can not contain empty fields!");
        }
    }
}
