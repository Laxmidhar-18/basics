public class Parent {
    int x = 10;
    public void m1(){
        System.out.println("method m1 in class parent");
    }
}
class  child extends Parent{
    public void m2(){
        System.out.println("method m2 in class child");
    }
}
class Demo{
    public static void main(String[] args) {
        child obj = new child();
        obj.x = 49;
        obj.m1();
        obj.m2();
    }
}
