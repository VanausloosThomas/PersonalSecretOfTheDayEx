package com.cegekaschool.secretguessinggame.model.exceptions;

import com.cegekaschool.secretguessinggame.model.pineapples.Pineapple;
import org.springframework.http.HttpStatus;

/**
 * Created by Thomas on 19/02/2017.
 */
public class ExceptionMapper {

    public HttpStatus mapException(Exception ex){


        if(ex.getClass() == InvalidGuessException.class){
            return HttpStatus.NOT_ACCEPTABLE;
        }

        if(ex.getClass() == PineappleAlreadyExistsException.class){
            return HttpStatus.ALREADY_REPORTED;
        }


        return HttpStatus.OK;
    }
}
