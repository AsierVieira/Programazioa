public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 2;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println( "ONE" );
      } else if ( number == 2) {
         System.out.println("TWO");
      } else if ( number == 3 ) {
         System.out.println("THREE");
      
      
      } else {
         System.out.println("OTHER");
      }
 
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println( "ONE" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "TWO" ); break;
         case 3:
            System.out.println( "THREE"); break;
         
         default: System.out.println( "OTHER" ); 
      }
   }
}