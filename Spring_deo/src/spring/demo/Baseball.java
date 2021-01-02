package spring.demo;

public class Baseball implements Coach_inteface {
	
	private FortuneService fortuneservice;
	
	public Baseball(FortuneService thefortuneservice)
	{
		fortuneservice=thefortuneservice;
	}
	
	public String getdaily() {
		return "spend 30 minutes in baseball coach";
	}

	
	@Override
	public String GetDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.GetFortune();
	}
	

}
