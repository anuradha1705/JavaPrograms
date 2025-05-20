class student{
    String name;
    int age;
    student(String n,int a){
        name = n;
        age = a;
    }
 
void display(){
    System.out.println("Name:"+name+"\nAge:"+age);
}

}



public class constructorDemo {
    public static void main(String[] args) {
        student s1=new student("Alice",20);
        s1.display();
    }
}
