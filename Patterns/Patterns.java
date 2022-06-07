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
    
    //----------------------------------------- hollow rectangle ----------------------------------------------------------
    static void hollowRect(int rows, int col){

        //      rows = columns

        //      *   *   *   *   *   *
        //      *                   *
        //      *                   *
        //      *                   *
        //      *   *   *   *   *   *

        System.out.println("Holow Rectangle");
        System.out.println();
        // for rows
        for(int i = 0; i <  rows; i++){
            // for columns
            for(int j = 0; j < col;j++){
                // print * when cursor at outer boudary 
                if(i==0 || j==0 || i ==rows -1 || j ==col -1){
                    System.out.print(" *\t");
                }
                // else print space
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    //----------------------------------------- Triangle ----------------------------------------------------------

    static void triangle(int rows){

        //  *
        //  *   *
        //  *   *   *
        //  *   *   *   *
        //  *   *   *   *   *

        System.out.println("Triangle");
        System.out.println();
        // for rows
        for(int i =1; i<= rows; i++){
            // for columns
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    //----------------------------------------- invertedTriangle ----------------------------------------------------------
    static void invertedTriangle(int rows){

        //  *   *   *   *   *
        //  *   *   *   *
        //  *   *   *
        //  *   *
        //  *   

        System.out.println("Inverted Triangle");
        System.out.println();
        // decrementing i and incrementing j
        System.out.println("decrementing i and incrementing j");
        System.out.println();
        for(int i= rows; i >= 1; i--){
            for(int j=1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();

        // decrementing i and decrementing j
        System.out.println("decrementing i and decrementing j");
        System.out.println();
        for(int i= rows; i >= 1; i--){
            for(int j=i; j >= 1; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    //----------------------------------------- rhombus ----------------------------------------------------------
    static void rhombus(int rows){

        //                      *   *   *   *   *
        //                  *   *   *   *   *
        //              *   *   *   *   *
        //          *   *   *   *   *
        //      *   *   *   *   *

        System.out.println("Rhombus");
        System.out.println();

        int space = rows;

        for(int i = 1; i<= rows; i++){
            for(int j = 1; j<= space; j++){
                System.out.print("\t");
            }
            for(int j =1; j<= rows; j++){
                System.out.print("*\t");
            }
            space--;
            System.out.println();
        }
    }

    public static void main(String[] args) {

      rectangle(5,6);
      hollowRect(5,6);
      triangle(5);
      invertedTriangle(5);
      rhombus(5);
    
    }
}
