package Java8Practice.design.patterns.creational.object.pool;

public class ExportingProcess {
	
	private long processNo;  
	  
    public ExportingProcess(long processNo)  {  
         this.processNo = processNo;  
        // do some  expensive calls / tasks here in future  
        // .........  
      System.out.println("Object with process no. " + processNo + " was created");  
     }  
     
    public long getProcessNo() {  
        return processNo;  
    }  

}
