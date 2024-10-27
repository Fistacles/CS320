/***********************
Andre Freitas
CS320
9/21/2024
***********************/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import ContactService.*;

public class ContactTest {

	@Test
	@DisplayName("Should throw an error if First Name has more than 10 characters")
	void testFirstName()  {

		assertThrows(Exception.class, () -> new Contact("Buccepholus", "LastName", "Phone", "Address", "0"));
	}

	@Test
	@DisplayName("Should throw an error if last name is more than 10 characters")
	void testLastName() {

		assertThrows(Exception.class, () -> new Contact("FirstName", "Buccepholus", "Phone", "Address", "0"));
	}

	@Test
	@DisplayName("Should throw an error if phone number is more than 10 numbers")
	void testPhone(){
		assertThrows(Exception.class, () -> new Contact("FirstName", "LastName", "000000000000", "Address", "0"));
	}

	@Test
	@DisplayName("Should throw an error if address is more than 30 characters")
	void testAddress()  {

		assertThrows(Exception.class, () -> new Contact("FirstName", "LastName", "Phone",
		"supercallifragilisticexpialidocious avenue", "0"));
	}

	@Test
	@DisplayName("Should throw an error if first name is null")
	void testFirstNameNull()  {
		assertThrows(Exception.class, () -> new Contact(null, "LastName", "Phone", "Address", "0"));
	}

	@Test
	@DisplayName("Should throw an error if last name is null")
	void testLastNameNull() {
		
		assertThrows(Exception.class, () -> new Contact("FirstName", null, "Phone", "Address", "0"));
	}

	@Test
	@DisplayName("Should throw an error if Phone Number is null")
	void testContactPhoneNotNull() {
		
		assertThrows(Exception.class, () -> new Contact("FirstName", "LastName", null, "Address", "0"));
	}

	@Test
	@DisplayName("Should throw an error if address is null")
	void testAddressNull() {
		assertThrows(Exception.class, () -> new Contact("FirstName", "LastName", "Phone", null, "0"));
	}
}