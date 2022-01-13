class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}

 class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }
}
public class MonsterTruck extends Truck{
    public void m1()
    {
        System.out.println("monster 1");

    }
    public void m2()
    {
        super.m1();
        super.m2();
    }
    public String toString(){
        return "monster"+ super.toString();

    }
    public static void main(String args[]){
        MonsterTruck monster=new MonsterTruck();
        monster.m1();
        monster.m2();
        System.out.println(monster);
    }

}