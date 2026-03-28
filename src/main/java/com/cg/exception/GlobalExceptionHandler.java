package com.cg.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidLoanAmountException.class)
	public ErrorResponse handleInvalidAmount(InvalidLoanAmountException ex) {
		return new ErrorResponse("InvalidLoanAmountException", ex.getMessage());
	}

	@ExceptionHandler(DuplicateLoanApplicationException.class)
	public ErrorResponse handleDuplicate(DuplicateLoanApplicationException ex) {
		return new ErrorResponse("DuplicateLoanApplicationException", ex.getMessage());
	}

	@ExceptionHandler(LoanNotFoundException.class)
	public ErrorResponse handleNotFound(LoanNotFoundException ex) {
		return new ErrorResponse("LoanNotFoundException", ex.getMessage());
	}
}