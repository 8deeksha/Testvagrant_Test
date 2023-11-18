import java.util.*;

class ShoppingCart{
      public long unitPrice;
      public float gst;
      public int quantity;

      ShoppingCart(long unitPrice,float gst,int quantity){
             this.unitPrice=unitPrice;
             this.gst=gst;
             this.quantity=quantity;
       }

}

public class test{
    public static void main(String [] args){
          double [] total=new double[4];
          double total_amount=0;
          double max_price=0;
          int maxItem=0;
          ShoppingCart LeatherWallet=new ShoppingCart(1100,18,1);
          ShoppingCart Umbrella=new ShoppingCart(900,12,4);
          ShoppingCart Cigarette=new ShoppingCart(200,28,3);
          ShoppingCart Honey=new ShoppingCart(100,0,2);
          ShoppingCart [] list=new ShoppingCart[4];
          list[0]=LeatherWallet;
          list[1]=Umbrella;
          list[2]=Cigarette;
          list[3]=Honey;
          for(int item=0;item<list.length-1;item++){
            total[item]=list[item].unitPrice*list[item].quantity+list[item].unitPrice*list[item].gst;
            if(list[item].unitPrice>500){
               total[item]=0.05*total[item];   
            }
            total_amount+=total[item];
          }
             for(int i=0;i<total.length-1;i++){
                if(total[i]>max_price){
                  max_price=total[i];
                  maxItem=i; 
                }
          }
          System.out.println(list[maxItem]);
          System.out.println(total_amount);

    }
}