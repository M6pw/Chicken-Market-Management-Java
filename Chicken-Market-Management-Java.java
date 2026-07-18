package javaapplication48;
 
 
public class JavaApplication48 {
 
    public static void main(String[] args) {
     chicken ch= new chicken(1,2.5);
     ch.print();
     chicken.setdaily_price(10);
     ch.print();
     chicken.setnecessary_weight(3);
     ch.print();
    }
   
}
class chicken{
    private static double daily_price=5;
    private static double necessary_weight=1.2;
    private  double weight;
    private int id;
   
    public chicken(int id,double weight){
        this.weight=weight;
        this.id=id;
    }
    public void setWeight(double weight){
         this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public static void setdaily_price(double newdaily_price){
        daily_price=newdaily_price;
    }
     public static void setnecessary_weight(double newnecessary_weight){
       necessary_weight = newnecessary_weight;
    }
     public boolean CanMarket(){
       if (weight>=necessary_weight){
         return true;
       }
       return false;
     }
     public double price(){
         if( CanMarket()){
             return weight*daily_price;
         }
         return 0;
     }
     public void print(){
         System.out.println("Chiken Weight: "+weight);
                  System.out.println("Chiken id: "+id);
                  if(CanMarket()){
                       System.out.println(" they ready for market:" );
                        System.out.println(" the price is :"+price() );
                  }
                  else{
                     System.out.println(" Don`t have necessary_weight"); 
                  }
     }
    
    
   
   
   
   
   
}