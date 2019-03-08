public class Main {	
	
	public static void main(String[] args) {
		
		EstudianteInfo  studentController = new EstudianteInfo();
		
		Estudiante[] estudiantes = {
				new Estudiante("Juan", 24),
				new Estudiante("Erica", 20),
				new Estudiante("Emilio", 23),
				new Estudiante("Karina", 21),
				new Estudiante("Eduardo", 24),
				new Estudiante("Tomas", 25),
		};
		
		int min = studentController.ages(estudiantes,"minima");
		int max = studentController.ages(estudiantes,"maxima");
		int avg = studentController.ages(estudiantes,"promedio");
		
		System.out.println("El total de estudiantes es: " + estudiantes.length);
		System.out.println("La edad minima de los estudiantes es: " + String.valueOf(min));
		System.out.println("La edad maxima de los estudiantes es: " + String.valueOf(max));
		System.out.println("La edad promedio de los estudiantes es: " + String.valueOf(avg));
		studentController.studentsPrint(estudiantes);		
		
	}

}
