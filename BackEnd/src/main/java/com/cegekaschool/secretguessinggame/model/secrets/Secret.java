package com.cegekaschool.secretguessinggame.model.secrets;

import java.awt.font.ImageGraphicAttribute;

/**
 * Created by thomasva on 17/02/2017.
 */
public class Secret {

    ImageGraphicAttribute picture;
    String comment;

    public Secret(ImageGraphicAttribute picture, String comment){
        this.picture = picture;
        this.comment = comment;
    }
}
