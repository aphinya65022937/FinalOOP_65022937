import java.util.ArrayList;

class Person {
    private String Name;
    private int Age;

    Person() {
    }

    Person(String Name) {
        this.Name = Name;
    }

    Person(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public void ShowDetails() {
        System.out.println("Name : " + this.Name);
        System.out.println("Age : " + this.Age);

    }

}

class Project {
    private String projectName;
    private String projectDescription;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public String getProjectDescription() {
        return this.projectDescription;
    }
}

class Job {
    private String Position;
    private String EmpID;

    Job() {
    }

    Job(String Position) {
        this.Position = Position;
    }

    Job(String Position, String EmpID) {
        this.Position = Position;
        this.EmpID = EmpID;
    }

    public void ShowDetails() {
        System.out.println("Position : " + this.Position);
        System.out.println("EmpID : " + this.EmpID);

    }

}

class Employee {
    private String name;
    private String position;
    private int empid;
    private ArrayList<Project> projects;

    public Employee(String name, String position, int empid) {
        this.name = name;
        this.position = position;
        this.empid = empid;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void getEmployeeDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("EmpID: " + this.empid);
        System.out.println("Projects:");
        for (Project project : this.projects) {
            System.out.println(project.getProjectName() + project.getProjectDescription());
        }
    }
}

public class main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", "UX/UI", 0001);
        employee1.addProject(new Project("Web A", "Developing a web application"));
        employee1.addProject(new Project("Mobile app A", "Developing a mobile app"));

        Employee employee2 = new Employee("Tim", "FrontEnd", 0002);
        employee2.addProject(new Project("Web A", "Developing a web application"));

        employee1.getEmployeeDetails();
        employee2.getEmployeeDetails();
    }
}