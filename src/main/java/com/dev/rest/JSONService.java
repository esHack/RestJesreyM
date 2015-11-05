package com.dev.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dev.bean.Expense;
import com.dev.db.ExpenseOp;



@Path("/json/alchemy")
public class JSONService {

	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Expense> getAllExpenses() {
		
		return ExpenseOp.getAllExpenses();
		
	}
	

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public String setAnExpense(Expense expense) {
	
		ExpenseOp.setExpense(expense);
		String result = expense.toString();
		return result;
		
	}
	
}