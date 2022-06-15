package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Jazz", "KU 77 76 44 R", 100000, "TopDogs", 20000);
    }

    @Test
    public void canGetName() {
        assertEquals("Jazz", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("KU 77 76 44 R", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000, director.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000);
        assertEquals(110000, director.getSalary(), 0.00);
    }

    @Test
    public void cannotRaiseSalaryAsNegative() {
        director.raiseSalary(-1000);
        assertEquals(100000, director.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(2000, director.payBonus(), 0.00);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("TopDogs", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(20000,director.getBudget(),0.00);
    }

    @Test
    public void canChangeName(){
        director.changeName("Holly");
        assertEquals("Holly", director.getName());
    }
}
