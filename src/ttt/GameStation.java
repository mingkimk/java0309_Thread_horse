package ttt;

import java.util.ArrayList;

public class GameStation {
	private int horseCount = 0;
	private ArrayList<Horse> hlist = new ArrayList<>();

	GameStation(int h) {
		horseCount = h;
	}

	public void finishHorse(Horse h) {
		hlist.add(h);
		if (hlist.size() == horseCount) {
			for (int i = 0; i < hlist.size(); i++) {
				System.out.println((i + 1) + "등 : " + hlist.get(i).getHName()+"입니다");
			}
		}
	}

}
