package two;

public class MoverAndAnimate implements Animatable{
	
	@Override
	public void move() {
		System.out.println("Move");
	}
	
	@Override
	public void animate() {
		System.out.println("animate");
	}
}
