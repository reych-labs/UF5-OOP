package cat.mvm.myapp.entities;

import java.time.LocalDate;

public class Employee {
    private String code;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private double monthlySalary;
    private int payments;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getPayments() {
        return payments;
    }

    public void setPayments(int payments) {
        this.payments = payments;
    }

    public String getFullName(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public String getReverseName(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public int getAge(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public int getSeniority(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public int getAnualSalary(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
