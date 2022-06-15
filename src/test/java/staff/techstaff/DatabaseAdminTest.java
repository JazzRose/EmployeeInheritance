package staff.techstaff;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Aaron", "KU 98 76 55 R", 40000);
    }

    @Test
    public void canGetName() {
        assertEquals("Aaron", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("KU 98 76 55 R", databaseAdmin.getNiNumber());
    }
    @Test
    public void canGetSalary() {
        assertEquals(40000, databaseAdmin.getSalary(),0.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(42000,databaseAdmin.getSalary(),0.00);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(400,databaseAdmin.payBonus(), 0.00);
    }
}

