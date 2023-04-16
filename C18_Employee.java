// 18 Create a class named 'Member' having the following members:
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of 
// the members. Two classes 'Employee' and 'Manager' inherits the 
// 'Member' class. The 'Employee' and 'Manager' classes have data 
// members 'specialization' and 'department' respectively. Now, assign 
// name, age, phone number, address and salary to an employee and a 
// manager by making an object of both of these classes and print the 
// same along with specialization and department respectively.

class Member {
    String name;
    int age;
    String phone_number;
    String address;
    float salary;

    public void printSalary() {
        System.out.println("the salary of the member " + name + " is: " + salary + ". ");
    }
}

class Employee extends Member {
    String specialization;
    public void displaySpecialization(){
        System.out.println("Specialization: " + specialization + ". ");
    }
}

class Manager extends Member {
    String department;
    public void displayDepartment(){
        System.out.println("Department: " + department + ". ");
    }
}

public class C18_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Manojkumar Trivedi";
        e1.age = 46;
        e1.phone_number = "9988774422";
        e1.address = "82, Gurjarnagar society, Rajpur";
        e1. salary = 60200.0f;
        e1.specialization = "Frantend Developer";

        Manager m1 = new Manager();
        m1.name = "Jigneshbhai Vador";
        m1.age = 52;
        m1.phone_number = "9874653764";
        m1.address = "128, Tejanagar, Kamalpur";
        m1.salary = 81400.0f;
        m1.department = "Corporation of Computer Department";

        System.out.println("Employee name: " + e1.name + ". ");
        System.out.println("Employee: "+e1.name+" age: " + e1.age + ". ");
        System.out.println("Employee: "+e1.name+" Phone number: " + e1.phone_number + ". ");
        System.out.println("Employee: "+e1.name+" Address: " + e1.address + ". ");
        e1.printSalary();
        e1.displaySpecialization();

        System.out.println();

        System.out.println("Manager name: " + m1.name + ". ");
        System.out.println("Manager: "+m1.name+" age: " + m1.age + ". ");
        System.out.println("Manager: "+m1.name+" Phone number: " + m1.phone_number + ". ");
        System.out.println("Manager: "+m1.name+" Address: " +m1.address + ". ");
        m1.printSalary();
        m1.displayDepartment();

    }
}

// Output:
// Employee name: Manojkumar Trivedi. 
// Employee: Manojkumar Trivedi age: 46.
// Employee: Manojkumar Trivedi Phone number: 9988774422.
// Employee: Manojkumar Trivedi Address: 82, Gurjarnagar society, Rajpur.
// the salary of the member Manojkumar Trivedi is: 60200.0. 
// Specialization: Frantend Developer.

// Manager name: Jigneshbhai Vador.
// Manager: Jigneshbhai Vador age: 52.
// Manager: Jigneshbhai Vador Phone number: 9874653764.
// Manager: Jigneshbhai Vador Address: 128, Tejanagar, Kamalpur.
// the salary of the member Jigneshbhai Vador is: 81400.0.
// Department: Corporation of Computer Department.