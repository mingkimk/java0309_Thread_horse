package ttt;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tName = { "Ã¶¼ö", "¿µÈñ", "¹Ì¾Ö", "ÈñÀÚ" };
		GameStation gs = new GameStation(tName.length);
		for (int i = 0; i < tName.length; i++) {
			Horse t = new Horse(gs);
			t.setName(tName[i]);
			t.start();
		}
	}

}
