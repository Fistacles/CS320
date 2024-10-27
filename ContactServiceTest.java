/***********************
Andre Freitas
CS320
9/21/2024
***********************/
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;

import ContactService.*;

public class ContactServiceTest{

    @Test
	@DisplayName("Test to Update First Name.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		assertDoesNotThrow(() -> service.addContact("Andre", "Freitas", "508-580-5008", "12 South Street"));
		service.updateFirstName("Gabe", service.getContactList().get(0).getContactID());
		assertEquals("Gabe", service.getContactList().get(0).getFirstName(), "First name was updated.");
	}

	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		assertDoesNotThrow(() -> service.addContact("Andre", "Freitas", "508-580-5008", "12 South Street"));
		service.updateLastName("Renato", service.getContactList().get(0).getContactID());
		assertEquals("Renato", service.getContactList().get(0).getLastName(), "Last name was updated.");
	}

	@Test
	@DisplayName("Test to update phone number.")
	@Order(3)
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		assertDoesNotThrow(() -> service.addContact("Andre", "Freitas", "508-580-5008", "12 South Street"));
		service.updatePhone("7777777777", service.getContactList().get(0).getContactID());
	
		assertEquals("7777777777", service.getContactList().get(0).getPhone(), "Phone number was updated.");
	}

	@Test
	@DisplayName("Test to update address.")
	@Order(4)
	void testUpdateAddress() {
		ContactService service = new ContactService();
		assertDoesNotThrow(() -> service.addContact("Andre", "Freitas", "508-580-5008", "12 South Street"));
		service.updateAddress("400 Broad Ave", service.getContactList().get(0).getContactID());
		assertEquals("400 Broad Ave", service.getContactList().get(0).getAddress(), "Address was updated.");
	}

	@Test
	@DisplayName("Test to ensure that service correctly deletes contacts.")
	@Order(5)
	void testDeleteContact() {
		ContactService service = new ContactService();
		assertDoesNotThrow(() -> service.addContact("Andre", "Freitas", "508-580-5008", "12 South Street"));
		service.deleteContact(service.getContactList().get(0).getContactID());
		// Ensure that the contactList is now empty by creating a new empty contactList to compare it with
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		assertEquals(service.getContactList(), contactListEmpty, "The contact was deleted.");
	}

	@Test
	@DisplayName("Test to ensure that service can add a contact.")
	@Order(6)
	void testAddContact() {
		ContactService service = new ContactService();
		assertDoesNotThrow(() -> service.addContact("Andre", "Freitas", "508-580-5008", "12 South Street"));
		assertNotNull(service.getContact(service.getContactList().get(0).getContactID()), "Contact was added correctly.");
	}
}