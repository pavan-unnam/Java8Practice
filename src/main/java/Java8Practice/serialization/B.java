package Java8Practice.serialization;

import java.io.Serializable;

class B extends A implements Serializable
{
    int j;
      
    // parameterized constructor
    public B(int i,int j) 
    {
        super(i);
        this.j = j;
    }
}
  

