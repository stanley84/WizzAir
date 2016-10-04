package com.wizzair.tests;

import java.sql.SQLException;

import org.junit.Test;

import com.wizzair.DBDAOs.UserDAO;
import com.wizzair.exceptions.UserException;
import com.wizzair.model.Gender;
import com.wizzair.model.User;

public class TestUserDAO {

	@Test
	public void test() throws SQLException, UserException, com.wizzair.model.UserException {
		new UserDAO().returnAllUsers();

		new UserDAO().registerUser(new User("pesho", "petur", "petrov", "pesho@abv.bg", "", "1234", Gender.MALE));
	}
}
