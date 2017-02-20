package com.cegekaschool.secretguessinggame.model.game;

import com.cegekaschool.secretguessinggame.model.exceptions.InvalidGuessException;
import com.cegekaschool.secretguessinggame.model.exceptions.LoginFailedException;
import com.cegekaschool.secretguessinggame.model.exceptions.PineappleAlreadyExistsException;
import com.cegekaschool.secretguessinggame.model.pineapples.PineappleService;

/**
 * Created by Thomas on 19/02/2017.
 */

public class GameService {

    private PineappleService pineappleService = new PineappleService();


    public void createNewUser(String userName, String userPassword) throws PineappleAlreadyExistsException {
        pineappleService.createPineapple(userName,userPassword);
    }

    public void login(String userName, String userPassword) throws LoginFailedException {
        pineappleService.login(userName,userPassword);
    }

    public void createGuess(String voter, String votee) throws InvalidGuessException {
        pineappleService.addGuess(voter,votee);
    }
}
