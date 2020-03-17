package ttt;
import java.util.Random;
public class Horse extends Thread {
	private Random r = new Random();
	private int nowE = 0;
	private String goGr = "";
	private String thisName = "";
	private GameStation gs = null;

	Horse(GameStation g) {
		this.gs = g;
	}
	public String getHName() {
		return thisName;
	}
	@Override
	public void run() {
		thisName = Thread.currentThread().getName();
		while (true) {
			gogogo();
			prt();
			if (nowE >= 50) {
				gs.finishHorse(this);
				break;
			}
		}
	}
	private void gogogo() {
		int nowP = r.nextInt(5) + 1;
		nowE = nowE + nowP;
		for (int i = 0; i < nowP; i++) {
			goGr = goGr + "#";
		//	System.out.println(thisName+i+"구간을 달리고 있습니다");
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void prt() {
		System.out.println(thisName + ":" + goGr + "(" + nowE + ")");
	}
}

