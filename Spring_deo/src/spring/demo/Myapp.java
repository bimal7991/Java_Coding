package spring.demo;

public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Coach_inteface coach= new Baseball();
       Coach_inteface thecoach=new Trackcoach();
       System.out.println(thecoach.getdaily());
	}

}
