package com.virtualprogrammers;

import java.math.BigDecimal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Spy;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.client.RestTemplate;

import com.virtualpairprogrammers.*;

public class RepaymentAmountTests {

    @Spy
    LoanApplication loanApplication;

    LoanCalculatorController controller;

    @Before 
    public void setUp() {
        loanApplication = spy(new LoanApplication());
        controller = new LoanCalculatorController();

        LoanRepository repository = mock(LoanRepository.class);
        JavaMailSender mailSender = mock(JavaMailSender.class);
        RestTemplate restTemplate = mock(RestTemplate.class);

        controller.setData(repository);
        controller.setMailSender(mailSender);
        controller.setRestTemplate(restTemplate);
    }

    @Test
    public void test1YearLoanWholePound() {
        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(12);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(110), loanApplication.getRepayment());
    }

    @Test
    public void test2YearLoanWholePound() {
        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(24);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(60), loanApplication.getRepayment());
    }

    @Test
    public void test5YearLoanWholePound() {
        loanApplication.setPrincipal(5000);
        loanApplication.setTermInMonths(60);
        doReturn(new BigDecimal(6.5)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(111), loanApplication.getRepayment());
    }
}