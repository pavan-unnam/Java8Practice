package Java8Practice.serialization;

class A 
{
    int i;
      
    // parameterized constructor
    public A(int i) 
    {
        this.i = i;
    }
      
    // default constructor
    // this constructor must be present
    // otherwise we will get runtime exception as 
    //java.io.InvalidClassException:no valid constructor
    public A()
    {
        i = 50;
        System.out.println("A's class constructor called");
    }
      
}
