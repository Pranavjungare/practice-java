// using getter and setter method .
class bankaccount{
    private int balance;
     
     public int getbalance(){
          return balance;
     }
     public void setbalance(int balance){
        this.balance=balance;

     }
}
class inheritance{
    public static void main(String[]args){
        bankaccount s1=new bankaccount();
         s1.setbalance(1000);
         System.out.println("balance :"+s1.getbalance());

    }
}