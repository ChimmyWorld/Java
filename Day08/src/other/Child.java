package other;

public class Child {
	private String name;
	private Ball ball;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ball getBall() {
		return ball;
	}
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	public Child(String name){
		this.name = name;
	}
	
	public void showInfo() {
		String name = (this.ball == null) ? "x" : ball.getType();
		System.out.printf("%s (공: %s)\n", this.name, name);
	}
	
	public void takeBall(Ball type) {
		this.ball = type;
		
		String msg = "%s(이)가 %s(을)를 얻었다\n";
		System.out.printf(msg, name, ball.getType());
	}
	
	public void throwBall(Child target) {
		target.ball = ball;
		// 같은 객체라면 private도 접근할 수 있다.
		String msg = "%s(이)가 %s에게 %s을 던짐\n";
		System.out.printf(msg, name, target.name, ball.getType());
		
		ball = null;
	}
}
