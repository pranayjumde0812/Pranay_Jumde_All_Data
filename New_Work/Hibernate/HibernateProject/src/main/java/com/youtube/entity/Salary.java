package com.youtube.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {

    private int salaryId;
    private int salary;

    public Salary(int salaryId, int salary) {
        this.salaryId = salaryId;
        this.salary = salary;
    }

    public Salary() {
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salaryId=" + salaryId +
                ", salary=" + salary +
                '}';
    }
}
