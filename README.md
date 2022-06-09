# learning_java

Note - This is just for reference if you need any help or find mistakes feel free to correct or contact me.
Thank You

Structure of code
```java

import java.util.*; // import additional functionality if needed

// filename = class name
public class Main {
    // main class for every class
    public static void main(String[] args) {
        // code here
        
    }


}
```
# Output

```java

System.out.println("Hello");

```

# Comments
ignored by programm 

```java
// this is a commetn
```

# Input 

Need to use Scanner class 

```java
import java.util.Scanner;
```

Then by creating a scanner object we can take input from user 

```java

Scanner scn = new Scanner(System.in);

int number = scn.nextInt();
```

```java
scn.nextInt();      // get an int
scn.nextFloat();    // get a float
scn.next();         // get a word
scn.nextLine();     // get a string
scn.hasNextInt();   // check if input is an int or not
```

# Variable

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

# Get input from user and print on terminal


```java

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scn.nextInt();
        System.out.println("You entered - " + number);
        
    }
    
}

```
# Control Flow Statements

### if 
```java
if(condition) {    
   //code   
} 
```
### if else
```java
if(condition) {    
    //code   
}  
else{  
    //code  
}  
```
### if else if
```java
if(condition 1) {    
    // code   
}  
else if(condition 2) {  
    // code  
}  
else {  
    // code     
}  
```
### Nested if else
```java
if(condition 1) {    
    //code 
    if(condition 2) {  
        // code   
    }  
    else{  
        // code   
    }  
}  
```
### Switch Case

```java
switch (var){  
    case c1:
        // code
        break;
    .  
    .  
    .  
    case cn:
        // code
        break;
    default:  
        // code  
}  
```

### Enhanced Switch
#### Supports multiple values per case
```java
switch (var) {
    case 001, 002, 003 :        
        // 001 -> Washing Machine
        // 002 -> AC
        // 003 -> Heater
        System.out.println("High Power Devices");
        break;
        
    case 004, 005:
        // 004 -> Mobile Phone
        // 005 -> LEDs
        System.out.println("Low power Devices");
        break;
}

```
#### yield is used to return a value. New keyword returns value from a branch. Break is not needed.
    
```java
int val = switch (val) {
    case "x", "y" :
        yield 1;
    case "z", "w" :
        yield 2;
}
```

####  Switch can be used as an expression

```java
String text = switch (itemCode) {
    case 001 : 
        yield "Washing Machine";
    case 002 :
        yield "AC";        
    case 003 :
        yield "Heater";
    default :
        throw new IllegalArgumentException(itemCode + "is an unknown device!");
}
```
#### Switch with arrows 
```java
switch (var) {
    case 001 -> //code
    case 002 -> //code
    case 003,004 -> {     // code
                          // code
                          // code
                     }
    default -> //code
}
```
       
