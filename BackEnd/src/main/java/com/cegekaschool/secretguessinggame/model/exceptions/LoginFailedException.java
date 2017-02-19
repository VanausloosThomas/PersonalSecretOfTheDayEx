package com.cegekaschool.secretguessinggame.model.exceptions;

import sun.rmi.runtime.Log;

/**
 * Created by Thomas on 19/02/2017.
 */
public class LoginFailedException extends  Exception {

    public LoginFailedException(String message){
        super(message);
    }
}
