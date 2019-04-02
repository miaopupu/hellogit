package TestCollectiopn;

import java.util.LinkedList;
import java.util.List;

import TestInterface.Hero;

public class HeroNode {
	Hero heroValue ;
	public HeroNode leftNode;
	public HeroNode rightNode;
	public void add(Hero h) {
		if(null==heroValue)
			heroValue = h;
		else {
			if(h.hp<=heroValue.hp) 
			  {if(null==leftNode)
				leftNode = new HeroNode();
			leftNode.add(h);}
			
		
		else {
			if(null==rightNode)
				rightNode = new HeroNode();
			rightNode.add(h);
		}
		}
	
		}
	public List<Hero> values() {
		List<Hero> values= new LinkedList<>();
		if(null!=leftNode)
			values.addAll(leftNode.values());
		values.add(heroValue);
		if(null!=rightNode)
			values.addAll(rightNode.values());
		return values;
	}
	public static void main(String[] args) {
		HeroNode h1 = new HeroNode();
		for(int  i=0;i<10;i++)
			h1.add(new Hero("hero"+i,(int)(100*Math.random())));
		System.out.println(h1.values());
	}
	}
