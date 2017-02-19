package com.cegekaschool.secretguessinggame.model.guesses;

import java.util.HashSet;

/**
 * Created by Thomas on 19/02/2017.
 */
public class GuessRepository {

    HashSet<Guess> guessRepo = new HashSet<>();

    public void addGuess(Guess guess){
        guessRepo.add(guess);
    }

    public HashSet<Guess> getAllGuesses(){

        return new HashSet<>(guessRepo);
    }
}
