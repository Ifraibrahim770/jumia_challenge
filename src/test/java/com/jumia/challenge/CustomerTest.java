package com.jumia.challenge;

import com.jumia.challenge.customer.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CustomerTest {


    @Test
    public void validMoroccoPhoneNumberTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(212) 691933626");
        assertEquals("VALID",testCustomer.getState());
        assertEquals("Morocco",testCustomer.getCountry());
        assertEquals("+212",testCustomer.getCountryCode());
        assertEquals("691933626",testCustomer.getNumber());
    }

    @Test
    public void validUgandaPhoneNumberTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(256) 704244430");
        assertEquals("VALID",testCustomer.getState());
        assertEquals("Uganda",testCustomer.getCountry());
        assertEquals("+256",testCustomer.getCountryCode());
        assertEquals("704244430",testCustomer.getNumber());
    }

    @Test
    public void validMozambiquePhoneNumberTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(258) 823747618");
        assertEquals("VALID",testCustomer.getState());
        assertEquals("Mozambique",testCustomer.getCountry());
        assertEquals("+258",testCustomer.getCountryCode());
        assertEquals("823747618",testCustomer.getNumber());
    }



    @Test
    public void validEthopianPhoneNumberTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(251) 914701723");
        assertEquals("VALID",testCustomer.getState());
        assertEquals("Ethiopia",testCustomer.getCountry());
        assertEquals("+251",testCustomer.getCountryCode());
        assertEquals("914701723",testCustomer.getNumber());
    }

    @Test
    public void validCameroonPhoneNumberTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(237) 699209115");
        assertEquals("VALID",testCustomer.getState());
        assertEquals("Cameroon",testCustomer.getCountry());
        assertEquals("+237",testCustomer.getCountryCode());
        assertEquals("699209115",testCustomer.getNumber());
    }

    @Test
    public void illegalCharactersTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "seven-three-five-eight");
        assertEquals("INVALID", testCustomer.getState());
        assertEquals("UNKNOWN",testCustomer.getCountry());
        assertNull(testCustomer.getCountryCode());
    }

    @Test
    public void unknownPhoneCountryCodeStateTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(254) 691933626");
        assertEquals(testCustomer.getState(), "INVALID");
        assertEquals("UNKNOWN",testCustomer.getCountry());
        assertNull(testCustomer.getCountryCode());
    }

    @Test
    public void excessPhoneCharactersTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(51) (212) 691933626");
        assertEquals(testCustomer.getState(), "INVALID");
        assertEquals("UNKNOWN",testCustomer.getCountry());
        assertNull(testCustomer.getCountryCode());

    }


    @Test
    public void lessPhoneCharactersTest() {
        Customer testCustomer = new Customer(0, "Walid Hammadi", "(212) 1933626");
        assertEquals(testCustomer.getState(), "INVALID");
        assertEquals("UNKNOWN",testCustomer.getCountry());
        assertNull(testCustomer.getCountryCode());
    }


}
