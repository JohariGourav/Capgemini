package basicInheritanceAssignment;

public class Top1 {

	public void disp() {
		System.out.println("this is top1 class");
	}
}

class Bottom1 extends Top1 {
	@Override
	public void disp() {
		System.out.println("this is bottom1 class");
	}
}

class Bottom2 extends Top1 {
	@Override
	public void disp() {
		System.out.println("this is bottom2 class");
	}
}

class Bottom3 extends Top1 {
	@Override
	public void disp() {
		System.out.println("this is bottom3 class");
	}
}