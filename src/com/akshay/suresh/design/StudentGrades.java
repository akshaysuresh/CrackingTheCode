package com.akshay.suresh.design;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StudentGrades {
	
	public static void main(String[] args) {
		List<Student> students =  new ArrayList<Student>();
		String filename = "C:/devl/Personal/CrackingTheCode/Grades_Input.txt";
	
		loadStudentsFromFile(students, filename);
		writeResultsToFile(students, filename);
	}

	@SuppressWarnings("deprecation")
	private static void loadStudentsFromFile(List<Student> students,
			String filename) {
		try {
		FileInputStream fis = new FileInputStream(filename);
		DataInputStream dis = new DataInputStream(fis);
			try {
				while(dis.available() != 0){
					String line = dis.readLine();
					Student student = new Student();
					double[] assignmentMarks = new double[10];
					int i=0;
					StringTokenizer st = new StringTokenizer(line);
					student.setName(st.nextToken());
					student.setMidTermMarks(Double.parseDouble(st.nextToken()));
					student.setFinalMarks(Double.parseDouble(st.nextToken()));
					while(st.hasMoreTokens()){
						assignmentMarks[i++] = Double.parseDouble(st.nextToken());
					}
					student.setAssignmentMarks(assignmentMarks);
					students.add(student);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void writeResultsToFile(List<Student> students,
			String filename) {
		File file = new File("C:/devl/Personal/CrackingTheCode/Grades_Output.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			for(Student s : students){
				double total = s.getMidTermMarks() + s.getFinalMarks();
				String studentDetail = s.getName() + " " + total + " " + s.getMidTermMarks() + " " + s.getFinalMarks();
				pw.println(studentDetail);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Student {
	
	String name;
	double midTermMarks;
	double finalMarks;
	double[] assignmentMarks;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMidTermMarks() {
		return midTermMarks;
	}
	public void setMidTermMarks(double midTermMarks) {
		this.midTermMarks = midTermMarks;
	}
	public double getFinalMarks() {
		return finalMarks;
	}
	public void setFinalMarks(double finalMarks) {
		this.finalMarks = finalMarks;
	}
	public double[] getAssignmentMarks() {
		return assignmentMarks;
	}
	public void setAssignmentMarks(double[] assignmentMarks) {
		this.assignmentMarks = assignmentMarks;
	}

}

