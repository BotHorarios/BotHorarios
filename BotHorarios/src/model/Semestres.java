package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Semestres {
	private Map<Integer, String[]> semestres = new HashMap<Integer, String[]>();
	
	public void contruindoMapa(){
		ArrayList<String> str = {"1�a", "1�b", "primeiroa", "primeirob", "1a", "1b"};
		semestres.put(1, str);
		str = {"2�a", "2�b", "segundoa", "segundob", "2a", "2b"};
		semestres.put(1, str);
	}
}
