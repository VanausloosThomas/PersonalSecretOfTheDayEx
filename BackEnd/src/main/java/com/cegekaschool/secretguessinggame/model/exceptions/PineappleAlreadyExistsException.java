package com.cegekaschool.secretguessinggame.model.exceptions;

import com.cegekaschool.secretguessinggame.model.pineapples.Pineapple;

/**
 * Created by Thomas on 19/02/2017.
 */
public class PineappleAlreadyExistsException extends Exception{

    public PineappleAlreadyExistsException(String message){
        super(message);
    }
}
