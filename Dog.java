
/**
 * Defines  class Dog.
 * 
 * @Darius Little
 * @10/23/2015
 */
import java.util.Scanner;
public class Dog
{
    private String dogName;
    private double dogAge;
    private double calculatePersonYears;
public Dog(){
    setDogName("Sam");
    setDogAge(5);
   
}  
public Dog(String newDogName, double newDogAge){
        dogName = newDogName;
        dogAge = newDogAge;
       
       
    }
 public void setDogName(String newDogName){
        dogName = newDogName;
    }
 public void setDogAge(double newDogAge){
        dogAge = newDogAge;
    }
 public void setCalculatePersonYears(double newcalculatePersonYears){
        calculatePersonYears = newcalculatePersonYears;
    }   
public double getCalculatePersonYears(){
        return dogAge*7;
    }
 public String getDogName(){
        return dogName;
    }
   
public  double getDogAge (){
        return dogAge;
    }
 public String toString(){
	return "\nName: " + dogName+"\nAge:"+dogAge ;

}    
}

