# learning_java


#Output

```java

System.out.println("Hello");

```

#Comments
ignored by programm 

```java
// this is a commetn
```

#Input 

Need to use Scanner class 

```java
import java.util.Scanner;
```

Then by creating a scanner object we can take input from user 

```java

Scanner scn = new Scanner(System.in);

int number = scn.nextInt();
```

#Variable

Used to store data 

## Various Data Types

Primitive and Non-Primitive

Primmitive 

```
byte - Takes 1 byte 
       Range -> -128 to 127
       Default value = 0
       
       Value range = -(2^(bits-1)) to (2^(bits-1)) - 1
       
       1 byte = 1 x 8 bits
       
short - Takes 2 byte 
        Range -> -32768 to 32767
        Default value = 0       
       
int - Takes 4 byte 
      Range -> -(2^31) to (2^31) - 1 
      Default value = 0   
       
float - Takes 4 byte 
        Range -> beyond the scope of discussion -> see java doc 
        Default value = 0.0f
         
long - Takes 8 byte 
       Range -> -(2^63) to (2^63) - 1  
       Default value = 0l
       
double - Takes 8 byte 
         Range -> see java doc   
         Default value = 0.0d
       
char - Takes 2 byte 
       Range -> 0 to 65535 -> (2^16 - 1)   
       Default value = '\u0000'
       
boolean - depends on jvm 
          Value can be -> true or false  
          Default value = false      
 
```
Non Primitive -> user defined       
       
       
