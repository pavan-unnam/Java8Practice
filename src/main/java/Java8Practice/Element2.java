package Java8Practice;

import java.util.HashMap;
import java.util.Map;

public enum Element2 {
	
    H("Hydrogen", "oxygen", "myrthene"),
    NE("Neon", "daD", "MASTER");
 
 
    private Element2(String... args) {

    }
    
 
    public static Element2 valueOfLabel(Element2 label) {
        return label;
    }
}
 
