package staff.techstaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Matt", "KU 77 76 55 R", 35000);
    }

    @Test
    public void canGetName() {
        assertEquals("Matt", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("KU 77 76 55 R", developer.getNiNumber());
    }
    @Test
    public void canGetSalary() {
        assertEquals(35000, developer.getSalary(),0.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(4000);
        assertEquals(39000,developer.getSalary(),0.00);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(350,developer.payBonus(), 0.00);
    }
}
