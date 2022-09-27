public class PrintDayInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 0;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 0) {   // Use == for comparison
         System.out.println( "Sunday" );
      } else if ( number == 1) {
         System.out.println("Monday");
      } else if ( number == 2 ) {
         System.out.println("Tuesday");
      } else if ( number == 3) {
         System.out.println("Wednesday");
      } else if ( number == 4 ) {
         System.out.println("Thursday");
      } else if ( number == 5 ) {
         System.out.println("Friday");
      } else if ( number == 6) {
         System.out.println("Saturday");
         
      
      } else {
         System.out.println("Not a valid day");
      }
 
      // Using switch-case-default
      switch(number) {
         case 0: 
            System.out.println( "Sunday" ); break;  // Don't forget the "break" after each case!
         case 1: 
            System.out.println( "Monday" ); break;
         case 2:
            System.out.println( "Tuesday"); break;
         case 3: 
            System.out.println( "Wednesday" ); break;  
         case 4: 
            System.out.println( "Thursday" ); break;
         case 5:
            System.out.println( "Friday"); break;
         case 6:
            System.out.println( "Saturday"); break;

         default: System.out.println("Not a valid day"); 
      }
   }
}