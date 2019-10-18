package drive08_A;

public class Cat {
// ■■■■■■■■ ■■■■■■■■
// field
	private char type;
	private String name;
	private int intimacy;

// ■■■■■■■■ ■■■■■■■■
// cnstructor
	public Cat(char type, String name) {
		this.type = type;
		this.name = name;
		this.intimacy = 0;
	}

// ■■■■■■■■ ■■■■■■■■
// method
	public void play() {
		this.intimacy ++;
	}

// ■■■■■■■■ ■■■■■■■■
// getter / setter
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIntimacy() {
		return intimacy;
	}

	public void setIntimacy(int intimacy) {
		this.intimacy = intimacy;
	}

} //class