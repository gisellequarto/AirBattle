package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Fuel {

    private int fuel;
    private Rectangle status1;
    private Rectangle status2;
    private Rectangle status3;
    private Rectangle status4;

   public Fuel() {
       fuel = 1500;
       status1 = new Rectangle(90, 19, 10, 10);
       status1.setColor(Color.YELLOW);
       status2 = new Rectangle(100, 19, 10, 10);
       status2.setColor(Color.YELLOW);
       status3 = new Rectangle(110, 19, 10, 10);
       status3.setColor(Color.ORANGE);
       status4 = new Rectangle(120, 19, 10, 10);
       status4.setColor(Color.ORANGE);
   }

   public void checkFuelStatus() {
           if (fuel >= 200) {
               status1.fill();
           } else {
               status1.delete();
           }
           if (fuel >= 400) {
               status2.fill();
           } else {
               status2.delete();
           }
           if (fuel >= 600) {
               status3.fill();
           } else {
               status3.delete();
           }
           if (fuel >= 800) {
               status4.fill();
           } else {
               status4.delete();
           }
   }

   public void refill(int refill) {
       fuel = refill;
       checkFuelStatus();
   }

   public void decrease() {
       fuel--;
       checkFuelStatus();
   }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int set) {
       fuel = set;
    }

}
