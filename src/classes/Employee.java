package classes;
import userFrame.adminFrame.EmployeeRecuitForm;
import java.util.ArrayList;
import java.util.Date;

public  class Employee extends User implements java.io.Serializable {

    public Employee(String id, String name, String cell, String email, String address, Date created) {
        super(id, name, cell, email, address, created);
    }
    int x=1520330;
    void create_new_Employee(){
        ArrayList<Employee> emps = new ArrayList<Employee>();
	
       
}}