package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double raise){
        if (raise > 0)
        this.salary += raise;
    }
    public double payBonus(){
        return this.salary / 100.00;
    }

    public void changeName(String name){
        this.name = name;
    }
}
