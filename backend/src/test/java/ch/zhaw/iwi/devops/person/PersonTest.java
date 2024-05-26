package ch.zhaw.iwi.devops.person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.person.Person;

class PersonTest {

    @Test
    void testGettersAndSetters() {
        Person person = new Person("John", "Doe", 25);

        // Test getters
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(25, person.getAge());

        // Test setters
        person.setFirstName("Jane");
        person.setLastName("Smith");
        person.setAge(30);

        assertEquals("Jane", person.getFirstName());
        assertEquals("Smith", person.getLastName());
        assertEquals(30, person.getAge());
    }

    @Test
    void testIsAdult() {
        Person adult = new Person("John", "Doe", 25);
        Person child = new Person("Jane", "Doe", 15);

        assertTrue(adult.isAdult());
        assertFalse(child.isAdult());
    }
}