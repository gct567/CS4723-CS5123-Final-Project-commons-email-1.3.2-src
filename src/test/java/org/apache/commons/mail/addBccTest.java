package org.apache.commons.mail;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

public class addBccTest extends TestCase{

	Email testEmail;
	
	@Before
	public void setUp() {
		testEmail = new SimpleEmail();
	}

	public void testAddBcc() throws EmailException {
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
	}
	
	public void testEmailArrayBcc() throws EmailException {
		
		String[] input = {"email1@email.com", "email2@email.com", "email3@email.com"};
		String[] expected = {"email1@email.com", "email2@email.com", "email3@email.com"};
		testEmail.addBcc(input);
		assertArrayEquals(expected, input);
		
	}
	
	public void testcharNameEmailAddBcc() throws EmailException {
		testEmail.addBcc("Email@Email.com","FirstLast");
		assertEquals("FirstLast <Email@Email.com>",testEmail.getBccAddresses().get(0).toString() );
	}

}
