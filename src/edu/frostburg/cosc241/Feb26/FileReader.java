package edu.frostburg.cosc241.Feb26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	/**
	 * Read a file of students and make those students, returning them
	 * 
	 * @param filename the name of the file
	 * @return the new student array
	 */
	public Student[] readStudentFile(String filename) {
		// SHOULD: return null when you have a bad filename
		// but won't because it requires other Java knowledge we don't need yet
		File file = new File(filename);
		Student[] students = new Student[5];

		try {
			Scanner fReader = new Scanner(file);

			int i = 0;
			while (fReader.hasNextLine()) {
				String line = fReader.nextLine();
//				System.out.println(line);
				String[] data = line.split(",");
				String name = data[0];
				String id = data[1];
				float gpa = Float.parseFloat(data[2]);
				int creds = Integer.parseInt(data[3]);
				Student s = new Student(name, id, gpa, creds);
//				System.out.printf("Did it work? ->%s%n", s);

				students[i++] = s;
//				i += 1;  // Can do it this way, but this example uses i++
			}

			fReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("This was a terrible error sadface doom!");
		} catch (Exception e) { // don't usually use this kind of exception
			System.err.println("Error!!!!!!1111");
		} finally {
//			System.out.println("This is text that prints after the rest");
		}

		return students;
	}
}
