package Java8Practice;

import java.util.HashMap;
import java.util.Map;

public enum Element {
	
    H("Hydrogen", "oxygen", "myrthene"),
    NE("Neon", "daD", "MASTER");
 
 
    private Element(String... args) {

    }
    
 
    public static Element valueOfLabel(Element label) {
        return label;
    }
}
 
