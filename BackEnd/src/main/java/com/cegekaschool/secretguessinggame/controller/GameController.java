package com.cegekaschool.secretguessinggame.controller;

import com.cegekaschool.secretguessinggame.model.exceptions.ExceptionMapper;
import com.cegekaschool.secretguessinggame.model.exceptions.InvalidGuessException;
import com.cegekaschool.secretguessinggame.model.exceptions.LoginFailedException;
import com.cegekaschool.secretguessinggame.model.exceptions.PineappleAlreadyExistsException;
import com.cegekaschool.secretguessinggame.model.game.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Thomas on 19/02/2017.
 */

@Controller
@RequestMapping("/secretoftheday")
public class GameController {

    //@Inject
    private GameService gameService = new GameService();
    private ExceptionMapper mapper = new ExceptionMapper();

    @RequestMapping(value = "/new-user", method = RequestMethod.POST)

    public HttpStatus createNewUser(@RequestParam(value = "userName", required = true) String userName,
                                    @RequestParam(value = "userPassword", required = true) String userPassword){
        try {
            gameService.createNewUser(userName,userPassword);
        } catch (PineappleAlreadyExistsException e) {
            return mapper.mapException(e);
        }
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public HttpStatus login(@RequestParam(value = "userName", required = true) String userName ,
                            @RequestParam(value = "userPassword", required = true) String userPassword) {

        try {
            gameService.login(userName, userPassword);
        } catch (LoginFailedException e) {
            return mapper.mapException(e);
        }

        return HttpStatus.OK;
    }


    @RequestMapping(value = "/guess", method = RequestMethod.POST)
    public HttpStatus createGuess(@RequestParam(value = "voter", required = true) String voter,
                                  @RequestParam(value = "votee", required = true) String votee){

        try {
            gameService.createGuess(voter, votee);
        } catch (InvalidGuessException e) {
            return mapper.mapException(e);
        }

        return HttpStatus.OK;
    }

    @RequestMapping(value = "/secret", method = RequestMethod.POST)
    public HttpStatus postSecret(){

        throw new NotImplementedException();
    }

    @RequestMapping(value = "/secret", method = RequestMethod.GET)
    public HttpStatus getSecret(){

        throw new NotImplementedException();
    }

    @RequestMapping(value = "/win", method = RequestMethod.GET)
    public HttpStatus validateWin(){

        throw new NotImplementedException();
    }


}
