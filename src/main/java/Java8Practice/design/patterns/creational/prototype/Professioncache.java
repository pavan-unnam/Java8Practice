package Java8Practice.design.patterns.creational.prototype;

import java.util.HashMap;

public class Professioncache {
	private static HashMap<Integer, Profession> hm = new HashMap<Integer, Profession>();
	
	public static Profession getCloneNewProfession(int id) {
		Profession cloneProf=hm.get(id);
		return (Profession) cloneProf.cloneIng();
	}
	
	public static void lodProfessionCache() {
		Engineer en = new Engineer();
		en.id = 1;
		hm.put(en.id, en);
		
		Teacher t = new Teacher();
		t.id = 2;
		hm.put(t.id, t);
	}

}
