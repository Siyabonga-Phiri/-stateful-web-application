/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateful
public class NewSessionBean implements NewSessionBeanLocal {

    private Integer num=100;

    @Override
    public Integer deductTicket(Integer numBuy) {
        
        
        num -= numBuy;
        return num;
    }

    @Override
    public Integer calcTickets() {
        return num--;
    }
    
    
    
}
