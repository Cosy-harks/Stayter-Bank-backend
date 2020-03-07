package com.stayter.reimbursement.bo;

import java.util.List;

import com.stayter.employee.to.Employee;
import com.stayter.reimbursement.to.Reimbursement;

public interface ReimbursementBO {
	public Reimbursement insertReimbursement(Reimbursement reimbursement, Employee employee);
	public List<Reimbursement> getReimbursements();
}
