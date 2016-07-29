package it.morfoza.java101.company;

public class Company {

    private Employee ceo;
    private Employee cfo;
    private Employee cleaner;

    public Company() {

        Employee john = new Employee(1000);
        Employee ben = new Employee(2000);
        Employee zdzisław = new Employee(5000);

        ceo = john;
        cfo = ben;
        cleaner = zdzisław;
    }

    public double calculateTotalSalaries() {
        return ceo.getSalary() + cfo.getSalary() + cleaner.getSalary();
    }

    public void giveRise(int percent) {
        ceo.giveRise(percent);
        cfo.giveRise(percent);
        cleaner.giveRise(percent);
    }

    @Override
    public String toString() {
        return "Company: [ceo: " + ceo + ", cfo: " + cfo + ", cleaner: " + cleaner + "]";
    }
}
