/**
 * 
 */
package com.springTest.service;

import com.springTest.po.User;

/**
 * @author tushen
 * @date Nov 4, 2011
 */
public interface LoginService {

	public User getUser(String userName,String password);
	public void addUser(User user);
	
}
