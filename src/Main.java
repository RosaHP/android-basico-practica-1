public class Main {
	
	public static int ages (Estudiante[] students, String age) {
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
	
	public static void studentsPrint (Estudiante[] students) {
		for(int i =0; i<students.length;i++)
			System.out.println(students[i].getNombre() + " tiene " + students[i].getEdad() + " años");		
	}
	
	public static void main(String[] args) {
		
		Estudiante[] estudiantes = {
				new Estudiante("Juan", 24),
				new Estudiante("Erica", 20),
				new Estudiante("Emilio", 23),
				new Estudiante("Karina", 21),
				new Estudiante("Eduardo", 24),
				new Estudiante("Tomas", 25),
		};
		
		int min = ages(estudiantes,"minima");
		int max = ages(estudiantes,"maxima");
		int avg = ages(estudiantes,"promedio");
		
		System.out.println("El total de estudiantes es: " + estudiantes.length);
		System.out.println("La edad minima de los estudiantes es: " + String.valueOf(min));
		System.out.println("La edad maxima de los estudiantes es: " + String.valueOf(max));
		System.out.println("La edad promedio de los estudiantes es: " + String.valueOf(avg));
		studentsPrint(estudiantes);
		
		
	}

}
