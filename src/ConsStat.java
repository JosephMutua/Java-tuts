
class DemoStat{
	int eid;
	int esalary;
	
	static {
		String cCeo = "Jonte";
	}
	
	void DemoStat(int eid, int esalary, String cCeo) 

	{
		this.eid= eid;
		this.esalary = esalary;
		//this.cCeo = cCeo;
		System.out.println(eid + ":" + esalary + ":" + cCeo);
	}
}
public class ConsStat {

	public static void main(String[] args) {
		
		DemoStat john = new DemoStat();
		john.eid = 23;
		john.esalary = 4000;
		john.DemoStat(0, 0, null);

	}

}
