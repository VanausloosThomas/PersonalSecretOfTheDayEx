package com.cegekaschool.secretguessinggame.model.pineapples;

import com.cegekaschool.secretguessinggame.model.secrets.Secret;

/**
 * Created by thomasva on 17/02/2017.
 */
public class Pineapple {

    String name;
    Secret secret;

    protected Pineapple(String name, Secret secret) {
        this.name = name;
        this.secret = secret;
    }


}
