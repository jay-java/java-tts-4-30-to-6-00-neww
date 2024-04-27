package basic;
abstract class RBI{
	public abstract void interest();
	public abstract void HL();
	public void call() {
		
	}
	public static void repoRate() {
		System.out.println("repo Rate : +-4%");
	}
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("sbi interest : 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi HL : 7%");
	}
	
}
class PNB extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("PNB interrest : 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("PNB HL : 8%");
	}
	
}
public class P014_Abstration {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.HL();
		s.interest();
		SBI s1 = new SBI();
		s1.HL();
		s1.interest();
		PNB p = new PNB();
		p.HL();
		p.interest();
		SBI.repoRate();
		PNB.repoRate();
	}
}
