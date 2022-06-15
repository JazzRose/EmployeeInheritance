package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

        Manager manager;

        @Before
        public void before() {
            manager = new Manager("Claudia", "KU 98 76 54 R", 30000, "Octopi Control");
        }

        @Test
        public void canGetName() {
            assertEquals("Claudia", manager.getName());
        }

        @Test
        public void canGetNiNumber() {
            assertEquals("KU 98 76 54 R", manager.getNiNumber());
         }
        @Test
        public void canGetSalary() {
            assertEquals(30000, manager.getSalary(),0.00);
        }

        @Test
        public void canRaiseSalary() {
            manager.raiseSalary(2000);
            assertEquals(32000,manager.getSalary(),0.00);
        }

        @Test
        public void canPayBonus() {
            manager.payBonus();
            assertEquals(300,manager.payBonus(), 0.00);
        }

        @Test
        public void canGetDeptName(){
           assertEquals("Octopi Control", manager.getDeptName());
        }
}



