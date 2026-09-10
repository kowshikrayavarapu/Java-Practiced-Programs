package practicejava;

public class exmp2{
	public String brand;
	public int manufactured;

	public void carCompany(String brand,int manufactured) {
		this.brand=brand;
		this.manufactured=manufactured;
		System.out.println("brand: " +brand);
		System.out.println("manufactured: "+manufactured);
	}
	/*public class bikeCom extends exmp2{
		public String Bname;
		public int Byear;
		
		public void bikeCompany(String Bname,int Byear) {
			this.Bname=Bname;
			this.Byear=Byear;
			System.out.println("Bname: " +Bname);
			System.out.println("Byear: " +Byear);
			
		}
	}*/
}
