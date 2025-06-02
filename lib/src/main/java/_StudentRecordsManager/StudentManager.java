package _StudentRecordsManager;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;


public class StudentManager {
	
	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
		
		List<Student> students = new ArrayList<>();

       
        students.add(new Student("Ali", 15.5));
        students.add(new Student("Sami", 18.0));
        students.add(new Student("Leila", 14.7));

        
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Chemin absolu : " + new java.io.File("students.txt").getAbsolutePath());
	try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
        for (Student s : students) {
            writer.write(s.getName() + "," + s.getGrade()); 
            writer.newLine(); 
        }
        System.out.println("Fichier 'students.txt' sauvegardé avec succès.");
    } catch (IOException e) {
        System.err.println("Erreur lors de la sauvegarde du fichier : " + e.getMessage());
    }

	
	

    try {
    	String filePath = "students.txt";
        
        List<Student> students1 = Files.lines(Paths.get(filePath))
            .map(line -> {
                String[] parts = line.split(",");
                String name = parts[0];
                double grade = Double.parseDouble(parts[1]);
                return new Student(name, grade);
            })
            .collect(Collectors.toList());

        
        Optional<Student> best = students1.stream()
            .max(Comparator.comparingDouble(s -> s.getGrade()));

        if (best.isPresent()) {
            Student top = best.get();
            System.out.println("🥇 Meilleur étudiant : " + top.getName() + " avec la note " + top.getGrade());
        } else {
            System.out.println("Aucun étudiant trouvé dans le fichier.");
        }

    } catch (IOException e) {
        System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
    }
}













}
