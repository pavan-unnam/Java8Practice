package Java8Practice.design.patterns.behavior.command;

public class ActionOpen implements ActionListernerCommand {
	
	private Document doc;  
    public ActionOpen(Document doc) {  
        this.doc = doc;  
    }  
    @Override  
    public void execute() {  
        doc.open();  
    }  

}
