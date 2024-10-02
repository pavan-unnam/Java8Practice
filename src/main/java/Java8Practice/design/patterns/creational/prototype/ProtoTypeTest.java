package Java8Practice.design.patterns.creational.prototype;

public class ProtoTypeTest {

	public static void main(String[] args) {
		Professioncache.lodProfessionCache();
		Profession pf = Professioncache.getCloneNewProfession(1);
		Profession pf1 = Professioncache.getCloneNewProfession(1);
		System.out.println(pf+" " + pf1);
	}

}
