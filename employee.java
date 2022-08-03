package day4;

public class employee {

    int id;
    String firstname;
    String lastname;
    int salary;
    int Annualsalary;
    int raisesalary;
    int present;



    public String getname(String firstname ,String lastname){

        return firstname+lastname;}


public void employee(int id, String firstname, String lastname, int salary){


}

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualsalary(int salary){

        return salary*12;

    }
    public int raisesalary(int salary,int present){

        return salary+present;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
