abstract class employee
{
    String name;
    int id;
    abstract void monthlySalary();
}
class FullTime extends employee{
    double monthlySalary;
    FullTime(String name,int id){
        monthlySalary=10000;
        super.name=name;
        super.id=id;
    }
    void monthlySalary(){
        System.out.println(name+" - "+id+": Full Time : Monthly salary is : "+monthlySalary);
    }
}
class PartTime extends employee{
    double monthlySalary;
    int hour,rate;
    PartTime(String name,int id,int hour,int rate){
        super.name=name;
        super.id=id;
        this.hour=hour;
        this.rate=rate;
        monthlySalary=hour*rate;
    }
    void monthlySalary(){
        System.out.println(name+" - "+id+": Part Time : Monthly salary is : "+monthlySalary);
    }
}
class Intern extends employee{
    double monthlySalary;

    Intern(String name,int id,int rate){
        super.name=name;
        super.id=id;
        monthlySalary=rate;
    }
    void monthlySalary(){
        System.out.println(name+" - "+id+": Intern : Monthly salary is : "+monthlySalary);
    }
}
public class p_5a2 {
    public static void main(String[] args) {
        employee[] emp={
                new FullTime("Alice",1),
                new PartTime("Bob",2,50,500),
                new Intern("perry",3,1000000),
                new FullTime("Julia",4),
                new PartTime("John",5,30,500),
                new Intern("amy",5,400000),
        };
        for(employee e1:emp)
        {
            if(e1 instanceof Intern)
            {
                System.out.println("He/She is Doing Internship ");
            }
            e1.monthlySalary();
        }
    }
}
