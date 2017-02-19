package com.cegekaschool.secretguessinggame.model.pineapples;

import com.cegekaschool.secretguessinggame.model.exceptions.PineappleAlreadyExistsException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 19/02/2017.
 */
public class PineappleRepository {

    ArrayList<Pineapple> pineappleRepository = new ArrayList<>();



    public void add(Pineapple newPineapple){

        pineappleRepository.add(newPineapple);
    }

    public List<Pineapple> getAllPineapples(){

        return  new ArrayList<Pineapple>(pineappleRepository);
    }
}
