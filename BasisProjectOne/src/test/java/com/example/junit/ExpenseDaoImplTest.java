package com.example.junit;

import static org.junit.Assert.assertEquals;
import java.sql.Date;
import java.util.List;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import com.example.dao.ExpenseDaoImpl;
import com.example.ers.Expense;
import com.example.ers.ReimbursementStatus;
import com.example.ers.ReimbursementTypes;

public class ExpenseDaoImplTest {

	ExpenseDaoImpl expDImpl = new ExpenseDaoImpl();
	Expense test = new Expense(1, 1, "Felix", "Soto", ReimbursementTypes.LODGING.getValue(), 500.00,
			new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()),
			ReimbursementStatus.APPROVED.getValue(), "Money!");

	@BeforeClass
	public static void methodCalledBeforeAllTests() {
		System.out.println("WELCOME TO JUNIT");
	}

	@Test
	public void areTwoExpensesFromIdEqual() {
		List<Expense> compare = expDImpl.selectExpensesByEmployeeId(1);
		for (Expense e : compare) {
			if (e.getTicketId() == test.getTicketId()) {
				assertEquals("should return Felix", test.getFirstname(), e.getFirstname());
				assertEquals("should return Soto", test.getLastname(), e.getLastname());
				assertEquals("should return LODGING or 1", test.getType(), e.getType());
				assertEquals("should return 500.0", test.getAmount(), e.getAmount(), 0);
				assertEquals("should return LODGING or 1", test.getType(), e.getType());
				assertEquals("should return APPROVED or 2", test.getStatus(), e.getStatus());
				assertEquals("should return Money!", test.getDescription(), e.getDescription());				
			}
		}
		System.out.println("method to check if the Expenses for an employee id is correctly returned");
	}

	@After
	public void afterMethod() {
		System.out.println("**************after each method**************");
	}
}