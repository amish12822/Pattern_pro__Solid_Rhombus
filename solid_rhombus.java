/**
 * solid_rhombus
*/
public class solid_rhombus {
    
    public static void main(String[] args) {
        

        // First method


        int a = 5;
    
        for ( int i=1; i<=a; i++){
            
            for ( int j=1; j<=a-i; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=a; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    


        // Second Method

        int n = 5;

        for ( int i=1; i<=5; i++){

            // space
            int space = ( n-i );
            for ( int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for ( int j=1; j<=5; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
       
        
    }
}
