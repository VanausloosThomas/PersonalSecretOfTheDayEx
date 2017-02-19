package com.cegekaschool.secretguessinggame.model.game;

import com.cegekaschool.secretguessinggame.model.exceptions.PineappleAlreadyExistsException;
import com.cegekaschool.secretguessinggame.model.guesses.GuessService;
import com.cegekaschool.secretguessinggame.model.pineapples.PineappleService;

/**
 * Created by Thomas on 19/02/2017.
 */
public class GameService {

    //@Inject
    private GuessService guessService = new GuessService();

    private PineappleService pineappleService = new PineappleService();


    public void createNewUser(String userName, String userPassword) throws PineappleAlreadyExistsException {
        pineappleService.createPineapple(userName,userPassword);
    }

    public void login(String userName, String userPassword) {
        pineappleService.login(userName,userPassword);
    }
}
