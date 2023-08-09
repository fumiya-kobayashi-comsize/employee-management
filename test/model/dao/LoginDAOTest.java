package model.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class LoginDAOTest {

	@Test
	void test1LoginCheck() {
		LoginDAO loginDao = new LoginDAO();
		boolean loginCheck =false;
		try {
			loginCheck = loginDao.loginCheck("1234","pass1");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		assertEquals(true,loginCheck);
	}

	@Test
	void test2LoginCheck() {
		LoginDAO loginDao = new LoginDAO();
		boolean loginCheck =false;
		try {
			loginCheck = loginDao.loginCheck("","");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		assertEquals(false,loginCheck);

	}

}