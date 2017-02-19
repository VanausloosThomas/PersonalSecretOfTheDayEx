package com.cegekaschool.secretguessinggame.model.guesses;



/**
 * Created by Thomas on 19/02/2017.
 */
public class GuessService {

     //@Inject
     private GuessRepository guessRepository = new GuessRepository(); // = new.. should be deleted when i get @Inject to work !
    private  GuessFactory guessFactory = new GuessFactory();


    public void createGuess(String voter, String votee) {
        //guessFactory.createGuess(voter, votee);
    }
}
