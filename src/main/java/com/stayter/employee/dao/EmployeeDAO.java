package com.stayter.employee.dao;

import com.stayter.employee.to.Employee;
import com.stayter.reimbursement.to.Reimbursement;

public interface EmployeeDAO {
	public Employee login(Employee employee);
	public void logout(Employee employee);
	public boolean insertReimbursmentRequest(Reimbursement reimbursement);
}
