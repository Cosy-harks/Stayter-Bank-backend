package com.stayter.employee.bo.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.stayter.employee.bo.EmployeeBO;
import com.stayter.employee.bo.impl.EmployeeBoImpl;
import com.stayter.employee.to.Employee;

class EmployeeBoImplTest {
	public static EmployeeBO ebo;
	public static Employee employee;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ebo = new EmployeeBoImpl();
		employee = new Employee("test", "first", "last");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		employee = ebo.login(employee.getUsername(), "tester");
	}
	
	@Test
	void testLogin() {
		assertEquals(employee, ebo.login(employee.getUsername(), "tester"));
	}

	@AfterEach
	void tearDown() throws Exception {
		ebo.logout(employee);
//		logger.log(ft);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
