package practice;
public class Janitor extends Employee {
    public int getHours() {
        return 2 * super.getHours();
    }
    
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    
    public void clean() {
        System.out.println("Workin' for the man.");
    }
    public static void main(String[] args) {

        Janitor janitor= new Janitor();
        int a=janitor.getHours();
        double b=janitor.getSalary();
        int c=janitor.getVacationDays();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
