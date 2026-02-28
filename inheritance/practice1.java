// Multilevel inheritance in java.
class person{
    void displayname(){
        System.out.println("ayush");
    }
} 
class student extends person{
    void displayclass(){
        System.out.println("class - 10th");
        
    }
}
class monitor extends student{
    void checkdiscipline(){
        System.out.println("Discipline = excellent");
    }
}

class practice1{
    public static void main(String[]args){
        monitor s1=new monitor();
        s1.displayclass();
        s1.checkdiscipline();

    }
}