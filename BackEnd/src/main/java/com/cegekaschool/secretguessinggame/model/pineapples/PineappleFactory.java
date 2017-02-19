package com.cegekaschool.secretguessinggame.model.pineapples;

import com.cegekaschool.secretguessinggame.model.secrets.Secret;

/**
 * Created by thomasva on 17/02/2017.
 */
public class PineappleFactory {

    public  Pineapple createPineapple(String name, String password) {

        return new Pineapple(name, password);
    }
}
