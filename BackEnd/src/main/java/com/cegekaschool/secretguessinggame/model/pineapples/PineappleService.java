package com.cegekaschool.secretguessinggame.model.pineapples;

import com.cegekaschool.secretguessinggame.model.exceptions.PineappleAlreadyExistsException;

/**
 * Created by Thomas on 19/02/2017.
 */
public class PineappleService {

    //@Inject
    private PineappleRepository pineappleRepository = new PineappleRepository();
    private PineappleFactory pineappleFactory = new PineappleFactory();


    public void createPineapple(String userName, String userPassword) throws PineappleAlreadyExistsException {

        Pineapple newPineapple = pineappleFactory.createPineapple(userName,userPassword);
        if(pineappleIsAlreadyInTheList(newPineapple)){
            throw new PineappleAlreadyExistsException("This user already exists!");
        }
        pineappleRepository.add(newPineapple);
    }

    private boolean pineappleIsAlreadyInTheList(Pineapple newPineapple){
        for (Pineapple pineappleInTheList : pineappleRepository.getAllPineapples()) {
            if(newPineapple.getName() ==  pineappleInTheList.getName()){
                return true;
            }
        }
        return  false;
    }
}
