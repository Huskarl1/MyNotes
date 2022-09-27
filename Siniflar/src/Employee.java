
public class Employee {
	 private String name;
	 public double salary;
	 private int workHours,hireYear;
	 
	 Employee(int workHours,int hireYear,String name, double salary){
		 this.name =name;
		 this.salary = salary;
		 this.hireYear =hireYear;
		 this.workHours = workHours;	 
		 
	 }
	public double tax() {
		if(this.salary >=1000) {
		return salary*0.03;
		}else {
		return 0.0;
		}
	}
	public double bonus() {
		int exstraHours=this.workHours-40;
		if(exstraHours>0) {
		return 30*exstraHours;}
		return 0.0;
	}
	public double incrase() {
		int year =2022 - this.hireYear;
		if(year<10) {
			return salary*0.5;
		}else if(10<=year && year<20){
			return salary*0.10;
			
		}else{
			return salary*0.15;
		}
	

	
	}
	
	
	
	public void toString(Employee emp) {
		System.out.println("Tax:"+emp.tax());
		System.out.println("Bonus:"+emp.bonus());
		System.out.println("Incrase Salary:"+emp.incrase());
		double totalSalary = emp.salary+emp.bonus()-emp.tax();
		System.out.println("Total Salary with tax and bonus:"+totalSalary);
		System.out.println("Total Salary with the raise of salary:"+(emp.salary+emp.incrase()));
	}
	
	
}
