package Java8Practice.design.patterns.behavior.command;

public class CommandPatternClient {

	public static void main(String[] args) {
		
		Document doc = new Document();  
        
		ActionListernerCommand clickOpen = new ActionOpen(doc);  
		ActionListernerCommand clickSave = new ActionSave(doc);  
          
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
          
        menu.clickOpen();  
        menu.clickSave();  

	}

}
