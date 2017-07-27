
public class test {
	public static void main(String[] args) {
		
		CommissionEmployee commissionEmployee = new CommissionEmployee("Ben","Lukyamuzi","122097253",53,0.8);

		System.out.println(commissionEmployee);

		HourlyEmployee hourguy = new HourlyEmployee("Babara", "Shabask", "90876555326",1000,60);

		System.out.println(hourguy);

		Employee[] guys = new Employee[2];

		guys[0] = commissionEmployee;
		guys[1] = hourguy;


		  for (Employee currentGuy : guys){

		 	 //System.out.println(currentGuy );
		 	 System.out.println(currentGuy.getClass().getName());


		 if (currentGuy instanceof HourlyEmployee){

			HourlyEmployee newhoursguy = (HourlyEmployee) currentGuy;

	  		newhoursguy.setWage(100 + newhoursguy.getWage());

	  		System.out.println("Here");

		  	System.out.println(newhoursguy.getWage());
		  	}


		  }


	}
}
