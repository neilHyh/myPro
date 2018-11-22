package Single;

public class SignlePatternDemo {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}
