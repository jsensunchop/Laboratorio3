public class Car {
	
	
	private String TireSize;
	private String HorsePower;

	private boolean HaveAC;
	private boolean HaveRadio;
	

	public String getTireSize() {
		return TireSize;
	}

	public String getHorsePower() {
		return HorsePower;
	}

	public boolean HaveAC() {
		return HaveAC;
	}

	public boolean HaveRadio() {
		return HaveRadio;
	}
	
	private Car(CarBuilder builder) {
		this.TireSize=builder.TireSize;
		this.HorsePower=builder.HorsePower;
		this.HaveAC=builder.HaveAC;
		this.HaveRadio=builder.HaveRadio;
	}
	
	//Builder
	public static class CarBuilder{

		private String TireSize;
		private String HorsePower;

		private boolean HaveAC;
		private boolean HaveRadio;
		
		public CarBuilder(String Ts, String Hp){
			this.TireSize=Ts;
			this.HorsePower=Hp;
		}

		public CarBuilder setHaveAC(boolean haveAC) {
			this.HaveAC = haveAC;
			return this;
		}

		public CarBuilder setHaveRadio(boolean haveRadio) {
			this.HaveRadio = haveRadio;
			return this;
		}
		
		public Carbuild(){
			return new Car(this);
		}

	}

}


public class Test {

	public static void main(String[] args) {
		
		Car Sail = new Car.CarBuilder(
				"15", "102").setHaveRadio(true)
				.setHaveAC(true).build();
	}

}