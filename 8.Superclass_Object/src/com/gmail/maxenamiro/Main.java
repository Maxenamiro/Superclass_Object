package com.gmail.maxenamiro;

public class Main {

	public static void main(String[] args) {

		Group group1 = new Group("Writer");

		Student student1 = new Student("Taras", "Shevchenko", Gender.Male, 1, "Writer");
		Student student2 = new Student("Ivan", "Franko", Gender.Male, 2, "Writer");
		Student student3 = new Student("Lesya", "Ukrainka", Gender.Female, 3, "Writer");
		Student student4 = new Student("Grugoriy", "Skovoroda", Gender.Male, 4, "Writer");
		Student student5 = new Student("Lina", "Kostenko", Gender.Female, 5, "Writer");
		Student student6 = new Student("Valerian", "Pidmohulniy", Gender.Male, 6, "Writer");
		Student student7 = new Student("Myhailo", "Kociubinskiy", Gender.Male, 7, "Writer");
		Student student8 = new Student("Mykola", "Khviloviy", Gender.Male, 8, "Writer");
		Student student9 = new Student("Volodymyr", "Vinnichenko", Gender.Male, 9, "Writer");
		Student student10 = new Student("Oleksandr", "Dovzhenko", Gender.Male, 10, "Writer");
		Student student11 = new Student("Maksym", "Nahnybida", Gender.Male, 11, "Writer");

		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);
			group1.addStudent(student6);
			group1.addStudent(student7);
			group1.addStudent(student8);
			group1.addStudent(student9);
			group1.addStudent(student10);
			group1.addStudent(student11); ///////////////////////
			group1.searchStudentByLastName("Dovzhenko");
			group1.searchStudentByLastName("Sadoviy");/////////////

			System.out.println(group1.removeStudentById(11));

		} catch (GroupOverflowException e) {
			e.printStackTrace();
		} catch (StudentNotFoundException r) {
			r.printStackTrace();
		}

		System.out.println("-----------------");

		System.out.println("1 -> 2 = " + student1.equals(student2));
		System.out.println("2 -> 3 = " + student2.equals(student3));
		System.out.println("1 -> 3 = " + student1.equals(student3));
		System.out.println("3 -> 3 = " + student3.equals(student3));

		System.out.println("------------------");

		System.out.println(student1.getName() + " " + student1.getLastName() + " -> hashCode = " + student1.hashCode());
		System.out.println(student2.getName() + " " + student2.getLastName() + " -> hashCode = " + student2.hashCode());
		System.out.println(student3.getName() + " " + student3.getLastName() + " -> hashCode = " + student3.hashCode());
		System.out.println("------------------");

		group1.checkStudentsForEquivalence();
	}

}
