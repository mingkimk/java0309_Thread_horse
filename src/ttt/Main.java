package ttt;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tName = { "ö��", "����", "�̾�", "����" };
		GameStation gs = new GameStation(tName.length);
		for (int i = 0; i < tName.length; i++) {
			Horse t = new Horse(gs);
			t.setName(tName[i]);
			t.start();
		}
	}

}
