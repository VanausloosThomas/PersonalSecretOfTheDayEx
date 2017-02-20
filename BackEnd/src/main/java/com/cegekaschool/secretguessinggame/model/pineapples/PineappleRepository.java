package com.cegekaschool.secretguessinggame.model.pineapples;

import com.cegekaschool.secretguessinggame.model.exceptions.PineappleAlreadyExistsException;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 19/02/2017.
 */
@Named
public class PineappleRepository {

    ArrayList<Pineapple> pineappleRepository = new ArrayList<>();



    public void add(Pineapple newPineapple){

        pineappleRepository.add(newPineapple);
    }

    public Pineapple getPineapple(String userName){
        for (Pineapple pineapple : pineappleRepository) {
            if(pineapple.getName() == userName){
                return pineapple;
            }
        }
        return null;
    }

    public List<Pineapple> getAllPineapples(){

        return  new ArrayList<Pineapple>(pineappleRepository);
    }
}
