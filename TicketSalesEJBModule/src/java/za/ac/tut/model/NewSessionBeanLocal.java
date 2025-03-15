/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface NewSessionBeanLocal {

    Integer deductTicket(Integer num);

    Integer calcTickets();
    
}
