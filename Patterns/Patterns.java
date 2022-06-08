public class Patterns {
  
    //----------------------------------------- solid rectangle ----------------------------------------------------------
    static void solidRect(int rows, int col){

        

        //      *   *   *   *   *   *
        //      *   *   *   *   *   *
        //      *   *   *   *   *   *
        //      *   *   *   *   *   *
        //      *   *   *   *   *   *

        System.out.println("Solid Rectangle");
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

    //----------------------------------------- trapezium ----------------------------------------------------------

    static void trapezium(int rows){
        // for rows = 3

        //          *   *   *
        //      *   *   *   *   *
        //  *   *   *   *   *   *   *

        System.out.println("Trapezium");
        System.out.println();

        int space = rows -1, star = rows;

        for(int i = 1; i<= rows; i++){
            for(int j = 1; j<= space; j++){
                System.out.print("\t");
            }
            for(int j =1; j<= star; j++){
                System.out.print("*\t");
            }
            space--;
            star +=2;
            System.out.println();
        }
    }
    //----------------------------------------- flipedTriangle ----------------------------------------------------------

    static void flipedTriangle(int rows){

        //                  *
        //              *   *
        //          *   *   *
        //      *   *   *   *
        //  *   *   *   *   *

        System.out.println("Fliped Triangle");
        System.out.println();

        int space = rows -1, star = 1;

        // for rows
        for(int i = 1; i<= rows; i++){
            // for space
            for(int j=1; j<= space;j++){
                System.out.print("\t");
            }
            // for star
            for(int j=1; j<= star; j++){
                System.out.print("*\t");
            }
            // increment star
            star++;
            // decrement space
            space--;
            System.out.println();
        }

    }

    //----------------------------------------- invertedflipedTriangle ----------------------------------------------------------

    static void invertedflipedTriangle(int rows){

        //  *   *   *   *   *
        //      *   *   *   *
        //          *   *   *
        //              *   *
        //                  *

        System.out.println("Inverted Fliped Triangle");
        System.out.println();
        
        int space = 0, star = rows;

        // for rows
        for(int i = 1; i<= rows; i++){
            // for space
            for(int j=1; j<= space;j++){
                System.out.print("\t");
            }
            // for star
            for(int j=1; j<= star; j++){
                System.out.print("*\t");
            }
            // increment star
            star--;
            // decrement space
            space++;
            System.out.println();
        }

    }

    //----------------------------------------- Diamond ----------------------------------------------------------
    static void diamond(int rows){

        //          *
        //      *   *   *
        //  *   *   *   *   *
        //      *   *   *
        //          *

        System.out.println("Diamond");
        System.out.println();

        if(rows%2 == 0){
            System.out.println("Enter only odd numbers");
        }
        else{
            int space = rows/2, star = 1;

            for(int i = 1;i<=rows;i++){
                for(int j = 1; j <= space;j++){
                    System.out.print("\t");
                }
                for(int j = 1; j <= star; j++){
                    System.out.print("*\t");
                }
                for(int j = 1; j <= star-1 ;j++){
                    System.out.print("*\t");
                }
                System.out.println();

                if(i < ((rows/2) + 1)){
                    star+=1;
                    space--;
                }else{
                    star -=1;
                    space++;
                }
            }
        }
    }
    
    //----------------------------------------- Diagonal Left to Right ----------------------------------------------------------
    static void diagL_R(int rows){

        //  *
        //      *
        //          *
        //              *
        //                  *

        System.out.println("Diagonal Left to Right");
        System.out.println();
        for(int i =1; i<= rows;i++){
            for(int j = 1; j <=i;j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print("\t");
                }
                
            }
            System.out.println();
        }
    }

    //----------------------------------------- Diagonal Right to Left ----------------------------------------------------------
    static void diagR_L(int rows){

        //                  *
        //              *
        //          *
        //      *
        //  * 

        System.out.println("Diagonal Right to Left");
        System.out.println();
        for(int i =1; i<= rows;i++){
            for(int j = 1; j <=rows;j++){
                if(i+j == rows+1){
                    System.out.print("*");
                }else{
                    System.out.print("\t");
                }
                
            }
            System.out.println();
        }
    }

    //----------------------------------------- Two Diagonals ----------------------------------------------------------
    static void twoDiag(int rows){

        //  *               *
        //      *       *
        //          *
        //      *       *
        //  *               *    

        System.out.println("Diagonal Left to Right and Right to Left");
        System.out.println();
        for(int i =1;i<= rows;i++){
            for(int j = 1; j<= rows;j++){
                if (i==j || i+j == rows+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    //----------------------------------------- Hollow Triangle left ----------------------------------------------------------
    static void hollowTriangle_left(int rows){

        //  *
        //  *   *
        //  *       *
        //  *           *
        //  *   *   *   *   *

        for(int i = 1; i <= rows; i++){
            for(int j = 1;j<= i;j++){
                if(j==1 || i== rows || i== j ){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    //----------------------------------------- Hollow Triangle right ----------------------------------------------------------
    static void hollowTriangle_right(int rows){

        //                  *
        //              *   *
        //          *       *
        //      *           *
        //  *   *   *   *   *

        for(int i = 1; i <= rows; i++){
            for(int j = 1;j<= rows;j++){
                if(j==rows || i== rows || i + j == rows +1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    //----------------------------------------- Hollow Triangle left inverted ----------------------------------------------------------
    static void hollowTriangle_left_inverted(int rows){

        //  *   *   *   *   *
        //  *           *
        //  *       *
        //  *   *
        //  *   

        for(int i = 1; i <= rows; i++){
            for(int j = 1;j<= rows;j++){
                if(i==1 || j== 1 || i+ j == rows +1 ){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    //----------------------------------------- Hollow Triangle right inverted ----------------------------------------------------------
    static void hollowTriangle_right_inverted(int rows){

        //  *   *   *   *   *
        //      *           *
        //          *       *
        //              *   *
        //                  *   

        for(int i = 1; i <= rows; i++){
            for(int j = 1;j<= rows;j++){
                if(i==1 || j== rows || i == j ){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    //----------------------------------------- More Triangles ----------------------------------------------------------
    static void tirangle1(int rows){

        //  *
        //  *   *
        //  *   *   *
        //  *   *
        //  *

        int star = 1;
        for(int i =1; i<= rows; i++){
            for(int j =1; j<=star;j++){
                System.out.print("*\t");
            }

            if(i <= rows/2){
                star++;
            }else{
                star--;
            }
            System.out.println();
        }
    }

    static void tirangle1_right(int rows){

        //          *
        //      *   *
        //  *   *   *
        //      *   *
        //          *

        int space = rows /2, star = 1;

        for(int i= 1; i<= rows; i++){
            for(int j = 1; j<= space; j++){
                System.out.print("\t");
            }

            for(int j = 1; j<= star; j++){
                System.out.print("*\t");
            }

            System.out.println();

            if(i <= rows/2){
                star++;
                space--;
            }else{
                star--;
                space++;
            }
        }
    }

    //----------------------------------------- Butterfly ----------------------------------------------------------
    static void butterfly(int rows){

        // for rows = 4

        //  *          *
        //  **        **
        //  ***      ***
        //  ****    ****
        //  *****  *****
        //  ************
        //  ************
        //  *****  *****
        //  ****    ****
        //  ***      ***
        //  **        **
        //  *          *
        
        for(int i = 1; i<=rows; i++){
            for(int j =1;j<= i; j++){
                System.out.print("*");
            }
            for(int j =1;j<= 2*(rows-i); j++){
                System.out.print(" ");
            }
            for(int j =1;j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = rows; i>=1; i--){
            for(int j =1;j<= i; j++){
                System.out.print("*");
            }
            for(int j =1;j<= 2*(rows-i); j++){
                System.out.print(" ");
            }
            for(int j =1;j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void numberTriangle1(int rows){
        
        //  1
        //  1   2
        //  1   2   3
        //  1   2   3   4
        //  1   2   3   4   5

        for(int i =1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    static void numberTriangle2(int rows){
        
        //  1
        //  2   2
        //  3   3   3
        //  4   4   4   4
        //  5   5   5   5   5

        for(int i =1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }

    static void numberTriangle3(int rows){
        
        //  1
        //  2   3
        //  4   5   6
        //  7   8   9   10
        //  11   12   13   14   15

        int count = 1;
        for(int i =1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
            
        }
    }

    static void numberTriangle4(int rows){

        //  0
        //  1       2
        //  3       5       8
        //  13      21      34      55
        //  89      144     233     377     610

        int a = 0, b = 1,c = 0;

        for(int i =1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print( c + "\t");
                c = a+b;
                a = b;
                b = c;
                
            }
            System.out.println();
            
        }
    }

    static void numberTriangle5(int rows){

        //  0
        //  1       1
        //  2       3       5
        //  8       13      21      34
        //  55      89      144     233     377

        int a = 0, b = 1,c = 0;

        for(int i =1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print( a + "\t");
                c = a+b;
                a = b;
                b = c;
                
            }
            System.out.println();
            
        }
    }

    static void numberTriangle6(int rows){

        //  0   1   0   1   0
        //  1   0   1   0   1
        //  0   1   0   1   0
        //  1   0   1   0   1
        //  0   1   0   1   0

        int c = 0;

        for(int i =1; i <= rows; i++){
            for(int j = 1; j<=rows; j++){
                System.out.print( c + "\t");
                if( c== 0){
                    c=1;
                }else{
                    c=0;
                }
            }
            System.out.println();
            
        }
    }

    static void numberTriangle7(int rows){

        // 1                        1
        // 1    2               2   1
        // 1    2   3       3   2   1
        // 1    2   3   4   3   2   1
        

        for(int i=1;i<=rows;i++){
            int c = 1;
            for(int j=1;j<=i;j++){
                System.out.print(c + "\t");
                c++;
            }
            for(int j=1;j<=2*(rows-i)-1; j++){
                System.out.print("\t");
                
            }
            if(i == rows){c--;}
            for(int j=1;j<=i;j++){
                c--;
                if(c>0){
                System.out.print(c + "\t");}
            }
            // System.out.print("end");
            System.out.println();
        }
    }

    static void starArrowToRight(int rows){
        
        //         *
        //         *   *
        // *   *   *   *   * 
        //         *   *
        //         *
        
        int space = rows/2, star = 1;
        for(int i = 1; i <= rows;i++){
            if(i == rows/2+1){
                space =0;
                for(int j =1;j<= rows/2 ;j++){
                    System.out.print("*\t");
                }
            }else{space = rows/2;}
            for(int j =1; j<= space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= rows/2 ){
                star++;
            }
            else{
                star--;
            }
        }
    }

    static void hourGlassHalfFilled(int rows){

    //  *   *   *   *   *   *   *
    //     *               *
    //         *       *
    //             *
    //         *   *   *
    //     *   *   *   *   *
    //  *   *   *   *   *   *   *

        // upper half
        for(int i=1; i<= (rows/2) + 1; i++){
            for(int j=1;j<=rows;j++){
                if(i==1 || i==j || i+j==rows+1){
                    System.out.print("*\t");
                }else{System.out.print("\t");}
            }
            System.out.println();
        }

        // lower half
        int space = rows/2 -1,star = 3;
        for(int i=1;i<= rows/2;i++){
            for(int j=1;j<= space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            space--;
            star+=2;
        }

    }

    static void table(int number){
        //  2 * 1 = 2
        //  2 * 2 = 4
        //  2 * 3 = 6
        for(int i=1;i<=10;i++){
            System.out.println(number+" * " +i+" = " + number*i);
        }
    }

    public static void main(String[] args){

        System.out.println("Patterns");
        
//         solidRect(5,6);
//         hollowRect(5,6);
//         triangle(5);
//         invertedTriangle(5);
//         rhombus(5);
//         trapezium(3);
//         flipedTriangle(5);
//         invertedflipedTriangle(5);
//         diamond(5);
//         diagL_R(5);
//         diagR_L(5);
//         twoDiag(5);
//         hollowTriangle_left(5);
//         hollowTriangle_right(5);
//         hollowTriangle_left_inverted(5);
//         hollowTriangle_right_inverted(5);
//         tirangle1(5);
//         tirangle1_right(5);
//         butterfly(4); 
//         numberTriangle1(5);
//         numberTriangle2(5);
//         numberTriangle3(5);
//         numberTriangle4(5);
//         numberTriangle5(5);
//         numberTriangle6(5);
//         numberTriangle7(5);
//         starArrowToRight(7);
//         hourGlassHalfFilled(1);

    }
}
