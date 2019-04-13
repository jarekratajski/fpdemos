package pl.setblack.fpdemo.structs;

import java.math.BigDecimal;

public class PersonImmutable {
    public final String firstName;
    public final String lastName;
    public final BigDecimal salary;

    public PersonImmutable(String firstName, String lastName, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    PersonImmutable withSalary(BigDecimal newSalary) {
        return new PersonImmutable(this.firstName, this.lastName, newSalary);
    }
}
