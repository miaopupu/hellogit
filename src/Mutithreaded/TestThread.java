package Mutithreaded;
import TestInterface.Hero;
public class TestThread {
	public static void main(String[] args) {
		Hero gareen = new Hero("gailun",616,50);
	    

	    Hero teemo = new Hero("teemo",300,30);
	    Hero leesin = new Hero();
	    Hero bh = new Hero();
        bh.name = "…ÕΩ¡‘»À";
        bh.hp = 500;
        bh.damage = 65;
        leesin.name = "√§…Æ";
        leesin.hp = 455;
        leesin.damage = 80;
	     
	   
	    Battle battle1 = new Battle(gareen,teemo);
	    new Thread(battle1).start();;
	}
	
}
