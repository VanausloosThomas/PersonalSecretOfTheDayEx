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
    public  void createGuess_returnsGuessClass(){
        PineappleFactory pineappleFactory = new PineappleFactory();
        Pineapple voter = pineappleFactory.createPineapple("aName", "aPassword");
        Pineapple votee = pineappleFactory.createPineapple("anOtherName", "anOtherPassword");
        Guess newGuess = Guess.createGuess(voter,votee);

        Assertions.assertThat(newGuess.getClass()).isEqualTo(Guess.class);
    }
}
