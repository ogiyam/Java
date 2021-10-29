package practice;

public class CapsuleMan {
	private String name;
	private int age;

    public CapsuleMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}


//「NoCapsuleMan.java」を「CapsuleMan.java」に変更して、カプセル化したプログラムに変更
//【変更前「NoCapsuleMan.java」】
//public NoCapsuleMan(String name, int age) {
//    this.name = name;
//    this.age = age;
//}
