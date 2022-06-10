class Fraction{
	private int numerator;
	private int denominator;
	public Fraction() {
		this.denominator=1;
		this.numerator=1;
	}
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if(denominator==0)
			this.denominator = 1;
		else
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		if(denominator!=0)
		this.denominator = denominator;
	}
	@Override
	public String toString() {
		if(this.denominator==1) {
			return " "+this.numerator;	
		}
		return " "+this.numerator+"/"+this.denominator;
	}
	public double getDecimelValue(){
		return this.numerator/this.denominator;
	}
   public boolean equals(Fraction other) {
	   if(this.getDecimelValue()==other.getDecimelValue()) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   public void multiply(Fraction other) {
	  int num=this.numerator*other.numerator;
	  int den=this.denominator*other.denominator;
	  this.setNumerator(num);
      this.setDenominator(den);;
   }
	
 
}