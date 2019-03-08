public class EstudianteInfo {

	public int ages (Estudiante[] students, String age) {
		int agesSum = 0;
		int youngest = students[0].getEdad();
		int oldest = students[0].getEdad();
		
		for (int i=0; i<students.length; i++) {
			if(students[i].getEdad()<youngest) {
				youngest = students[i].getEdad();
			}
			else if (students[i].getEdad()>oldest) {
				oldest = students[i].getEdad();
			}			
			agesSum += students[i].getEdad();
		}
		
		if (age.equalsIgnoreCase("minima")) {
			return youngest;
		}
		else if (age.equalsIgnoreCase("maxima")) {
			return oldest;
		}
		else if (age.equalsIgnoreCase("promedio")) {
			return agesSum/students.length;
		}
		else
			return 0;
	}
	
	public  void studentsPrint (Estudiante[] students) {
		for(int i =0; i<students.length;i++)
			System.out.println(students[i].getNombre() + " tiene " + students[i].getEdad() + " años");		
	}

}
