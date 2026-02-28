// ATM implementation using encapsulation.
class atm{
    private int paisa;
    public atm(int r){
        this.paisa=r;
    }
    public int getbalance(int a){
        return paisa-a;
    }
}
class practice2{
    public static void main(String[]args){
        atm s1=new atm(1000);
        System.out.println(+ s1.getbalance(20));


    }
}