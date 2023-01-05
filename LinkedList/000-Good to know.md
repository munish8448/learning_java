# Linked List 
In order to start understanding Linked List we need to know a few things.
Only points required to understand linked list are given below.


## Object Oriented Programming 

An object living or non-living has 2 things.


| **Object** | 
| ----------- | 
| **Data / Knowledge / Peoperty**  | 
| **Method / Function / Behaviour / Work** | 



### Class
Blueprint 
Enable us to create multiple object

### Contructor
Similar to a function and has same name as class.
Types:-
1. Default
2. Parametrized

If constructor is not provided by used java will provide a default constructor.

### Destructor 
Do not exist in java here we have **Garbage Collector**
invoked at the time of memory allocation.
invoked automatically.

### Access Specifier

1. Private - Only in Class
1. Public  - Everywhere
1. Protected - Used in **Inheritance**
1. Default - Only in same package


Now Let's create a Client class that will create a client and will be used to update data of client.

```java
public class client{
    
    // Knowledge
    public String name;
    public int id;

    // behaviour
    public void clientDetails(){
        System.out.println("name : " + name +", ID : " + id);
    }

}
```
In order to use the client class lets create a drived class.

```java
public class driver {
    public static void main(String[] args) {

        // client() -> default constructor provided by java
        // c1 is a client
        client c1 = new client();
        // set name of client
        c1.name  = "ABC";

        client c2 = new client(); 
        // set name of c2
        c2.name = "DEF";
        // give id to c2
        c2.id = 55;

        c1.clientDetails();
        c2.clientDetails();

    }
    
}
```
#### Output
```
name : ABC, ID : 0
name : DEF, ID : 55
```


### Getters and Setters

When we have private variable in a class we can't access it in another class (driver class in our case).
So we need getters and setters.
```java
public class client{
    
    // Knowledge
    private String name;
    private int id;

    void setName(String input){
        name = input;
    }
    void giveId(int input){
        id = input;
    }

    // behaviour
    public void clientDetails(){
        System.out.println("name : " + name +", ID : " + id);
    }

}
```

```java
public class driver {
    public static void main(String[] args) {
        
        // client() -> default constructor provided by java
        client c1 = new client();
        c1.setName("ABC");
        
        client c2 = new client();
        c2.setName("DEF");
        c2.giveId(55);

        c1.clientDetails();
        c2.clientDetails();

    }
    
}
```

#### Output
```
name : ABC, ID : 0
name : DEF, ID : 55
```

### this Keyword

When we have same variable name in class & parameter the constructor in java gets confused when to use which.

```java
public class client{
    
    private String name;
    private int id;

    client(String name, int id){
        // which name ? class variable or function parameter which one to update ?
        name = name;
        // which id ?
        id = id;
    }
}
```

to make this clear we use **this** keyword. This is one of the use of **this** keyword (clears the confusion).

```java
public class client{
    
    private String name;
    private int id;

    client(String name, int id){
        // this.name - name variable in client class and name is the parameter of function same for id
        this.name = name;
        this.id = id;
    }
}
```

### Static

