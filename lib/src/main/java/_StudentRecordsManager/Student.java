package _StudentRecordsManager;

public class Student {
	
		
		 private String name;
		 private double grade;
		 
		 public String getName() {
			 
			 return name;
			 
			 
		 }
		 
         public double getGrade() {
			 
			 return grade;
			 
			 
		 }
         
         public void  setName(String name) { 
        	 this.name = name; 
		 }
         
         
         public void  setGrade(double grade) { 
        	 this.grade = grade; 
		 }
         
         public Student() {
             
         }
         
		 public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
		 
		 @Override
		public String toString() {
		// TODO Auto-generated method stub
		return ("Nom: " + name + ", Note: " + grade);
		}
	}



