import java.lang.Math; 
import java.text.SimpleDateFormat;
import java.util.Date;


public class hellomins
{
  public static void main(String[] args)
  {


String dateStart = "11:00:00";
String dateStop = "12:43:00";
SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");  
Date d1 = null;
Date d2 = null;
try {
    d1 = format.parse(dateStart);
    d2 = format.parse(dateStop);
} catch (Exception e) {
    e.printStackTrace();
}    

// Get msec from each, and subtract.
long diff = d2.getTime() - d1.getTime();
long diffSeconds = diff / 1000;         
long diffMinutes = diff / (60 * 1000);         
long diffHours = diff / (60 * 60 * 1000);              
int parkingEntry=2;
int firstHour=3;
int parkingRate=4;
int Total=0;

System.out.println("Time in seconds: " + diffSeconds + " seconds.");         
System.out.println("Time in minutes: " + diffMinutes + " minutes.");         
System.out.println("Time in hours: " + diffHours + " hours."); 

double my_hrs=diffMinutes/60d;
     int r = (int) Math.round(my_hrs);
System.out.println("Time in hours Round : " + r + " hours."); 


  }
}