package com.f1soft.Task.DesignPatterns.Behavioral.Command.StockOperation;

import java.util.ArrayList;
import java.util.List;

public class Broker {
     private List<Order> orderList=new ArrayList<Order>();

     public void takeOrder(Order order){
          orderList.add(order);
     }
     public void placeOrder() {
          for (Order order : orderList) {
               order.execute();
          }
     }


}
