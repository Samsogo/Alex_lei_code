package Jdbc.Entity;

public class Emp {

    //Attributes
    private int id;
    private String name;
    private String job;
    private int sal;
    private int comm;
    public Emp(){}

    //constructor
    public Emp(int id,String name,String job,int sal,int comm){
        this.id = id;
        this.name = name;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }

    //get and set methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    //toString method
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }
}
