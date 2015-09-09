package com.model;
 


import static org.junit.Assert.*;

import org.junit.Test;
 
public class UserTest {
 
	@Test
    public void isNameOfUser(){
    	User u = new User();
        u.setName("jonas");
        assertEquals("jonas",u.getName());
       
    }
}