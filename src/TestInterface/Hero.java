package TestInterface;

import java.util.ArrayList;
import java.io.Serializable;
import java.security.cert.TrustAnchor;
import java.util.List;
import java.util.Iterator;

public class Hero implements Comparable<Hero> {
	public String name;
	public float hp;
	public float armor;
	int moveSpeed;
	public int damage;

	static String copyright = "hehe";

	private static void battleWin() {
		System.out.println("battleWin");
	}

	public synchronized void recover() {
		if (this.hp == 1000)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		hp = hp + 1;
		System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
		
	}

	public synchronized void hurt() {
		if (this.hp == 1) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		try {
			this.notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
		hp = hp - 1;
		System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
	}

	public Hero(String heroname, int herohp, int herodamage) {
		this(heroname);
		hp = herohp;
		damage = herodamage;
	}

	public Hero(String heroname, int herohp) {
		this(heroname);
		hp = herohp;

	}

	public Hero(String name) {

		this.name = name;
	}

	public Hero() {

	}

	public void attackHero(Hero h) {
		/*
		 * try { Thread.sleep(1000); }catch(InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		h.hp = h.hp - damage;
		System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
		if (h.isdead())
			System.out.println(h.name + "死了！");
	}

	static class EnemyCrystal {
		int hp = 5000;

		public void checkIfVictory() {
			if (hp == 0) {
				Hero.battleWin();

			}
		}
	}

	public boolean equals(Object o) {
		if (o instanceof Hero) {
			Hero h = (Hero) o;

			return (this.hp == h.hp);
		}
		return false;
	}

	public boolean isdead() {
		return this.hp <= 0 ? true : false;
	}

	public String toString() {

		return this.name + "  " + this.hp;

	}

	public int compareTo(Hero o) {
		if (hp < o.hp)
			return 1;
		else
			return -1;
	}

}