package com.stayter.employee.bo.impl;

import java.util.Date;
import java.util.List;

import com.stayter.employee.bo.EmployeeBO;
import com.stayter.employee.to.Employee;
import com.stayter.reimbursement.to.Reimbursement;

public class EmployeeBoImpl implements EmployeeBO {

	@Override
	public boolean addReimbersmentRequest(String desc, float amount, Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Reimbursement> getPendingRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getResolvedRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLoggedIn(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
