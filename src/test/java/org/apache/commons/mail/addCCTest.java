package org.apache.commons.mail;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;
import org.junit.Test;

public class addCCTest extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testSingleEmailAddCc() throws EmailException {
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}
	
	public void testEmailArrayAddCC() throws EmailException {
		
		String[] input = {"email1@email.com", "email2@email.com", "email3@email.com"};
		String[] expected = {"email1@email.com", "email2@email.com", "email3@email.com"};
		testEmail.addCc(input);
		assertArrayEquals(expected, input);
		
	}
	
	public void testcharNameEmailAddCc() throws EmailException {
		testEmail.addCc("Email@Email.com", "FirstLast");
		assertEquals("FirstLast <Email@Email.com>",testEmail.getCcAddresses().get(0).toString() );
	}
	public void testAddCcStringsChar() throws EmailException {
		testEmail.addCc("Email@Email.com","FirstLast","UTF-16");
}

}