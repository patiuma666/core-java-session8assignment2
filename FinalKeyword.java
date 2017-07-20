/*here we are showing the use of a final keyword.
 *Final is a keyword,that once we make a reference final and that we cannot change that reference.
 * here we are showing how the final keyword is assigned for class ,methods and variables
 * and constructor cannot be a final .
*/

package finalkeyworddemo;                         // here I have created a package as finalkeyworddemo

      public class FinalKeyword {
           public static  void main (String []args){            //here i have taken  main class and main method 
        	                                                 //and created sub classes to assign the variables and methods 
                                                           //and created two  objects which displays the output 
          Weeks weeks=new Weeks();                           
            Months months =new Months(); 
        
            weeks.display();                        
            months.display();                        
           }
}
   // if i have taken the weeks class as final and that class cannot be extended another subclass because we declared it has final                                  
   
     final class Weeks{                                        //here I'm taking the sub class name as Weeks 
                                                         //here i am showing the use of a final keyword in the variables
      
    	  final int DAYS =7;                        //and i have taken an integer variable  as days =7 and i declared it as final  
                                                       
    	  //and as if i have taken days =8 after declaring the variable has final the compiler shows an error that after assigning a variable has final it cannot change in whole programme 
	public   final void display(){                           //here i created a method to show  and it displays the output
		
		System.out.println("Days in a week"+DAYS);      //and final variables cannot be changed .if we initialized blank variables has final then we can assign them by using the constructors
	
	}
}                                                  //  here I'm taking another class Months which extends the Weeks class
                                                     //and here I'm showing the use of final in methods 
         class Months extends Weeks{
        	 
	          public  void display (){                                          //here i'm taking the method as final in the above class and i'm trying to extend the weeks class  with months class 
		
		 System.out.println("this months class extends weeks class");      //now it shows an error in this line that if we declared a method as final it cannot be override
	 }  
 }
 
          

 