package com.stayter.employee.bo;

import java.util.Date;
import java.util.List;

import com.stayter.employee.to.Employee;
import com.stayter.reimbursement.to.Reimbursement;

public interface EmployeeBO {
	public Employee login(String username, String password);
	public boolean isLoggedIn(Employee employee);
	public boolean logout(Employee employee);
	public List<Reimbursement> getPendingRequests();
	public List<Reimbursement> getResolvedRequests();
	public boolean addReimbersmentRequest(String desc, float amount, Date date);
	public boolean update(String password);
}
