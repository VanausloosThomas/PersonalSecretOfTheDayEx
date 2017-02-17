package com.cegekaschool.secretguessinggame.model.guesses;

import com.cegekaschool.secretguessinggame.model.pineapples.Pineapple;
import com.cegekaschool.secretguessinggame.model.pineapples.PineappleFactory;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by thomasva on 17/02/2017.
 */
public class GuessTest {

    @Test

    public void guessFactory_CreatGuess_ReturnsGuess()  {

        GuessFactory guessFactory = new GuessFactory();
        PineappleFactory pineappleFactory = new PineappleFactory();
        Pineapple pineapple1= PineappleFactory.createPineapple();
        Pineapple pineapple2= PineappleFactory.createPineapple();




    }

}
