package lesson;

public class L54 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	public static void hello() {
		System.out.println("さん、こんにちは");
	}
}
