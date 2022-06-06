public class Patterns {
  
    //-----------------------------------------rectangle ----------------------------------------------------------
    static void rectangle(int rows, int col){
        //      rows = columns  
        
        //      *   *   *   *   *   *
        //      *   *   *   *   *   *
        //      *   *   *   *   *   *
        //      *   *   *   *   *   *
        //      *   *   *   *   *   *
        
        System.out.println("Rectangle");
        System.out.println();
        
        // outer loop for rows 
        for(int i = 1; i<= rows; i++){
            // inner loop for coloumns
            for(int j=1;j<=col;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    
    }

    public static void main(String[] args) {

      rectangle(5,6);
    
    }
}
