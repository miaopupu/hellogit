package Mutithreaded;
import TestInterface.Hero;
public class TestSignal {
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "¸ÇÂ×";
        gareen.hp = 616;
        Thread []hurtthread = new Thread [5] ;
        for(int i=1;i<5;i++) {
        	hurtthread[i] = new Thread(){
                public void run(){
                    while(true){
                        gareen.hurt();
       
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
       
                }
            };
            hurtthread[i].start();
        }
        
        
        Thread []recoverthread = new Thread [2];
        for(int i=0;i<2;i++) {
        	recoverthread[i]=  new Thread(){
                public void run(){
                    while(true){
                        gareen.recover();
       
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
       
                }
            };
            recoverthread[i].start();
        }
	}
}
