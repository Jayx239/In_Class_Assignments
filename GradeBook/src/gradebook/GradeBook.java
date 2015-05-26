/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class GradeBook {
    public GradeBook(){
        
    }
    Map<String,String> students = new HashMap<String ,String>();
    private LinkedList<String> student = new LinkedList<String>();
    private LinkedList<String> studentGrade = new LinkedList<String>();
    static int num = 0;
    
    public void addStudent(String studentName){
        students.put(studentName, null);
    }
    public void modifyGrade(String studentName, String grade){
        students.put(studentName, grade);
    }
    public void printAllGrades(){
        List<String> v = new ArrayList<String>(students.keySet());
        Collections.sort(v);
        ListIterator it = v.listIterator();
        ListIterator itt;
        
        while( it.hasNext()){
            Object ittt = it.next();
        System.out.println(ittt + ": " + students.get(ittt));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GradeBook gradebook = new GradeBook();
        /*gradebook.addStudent("Jason");
        gradebook.modifyGrade("Tim","F");
        gradebook.printAllGrades();
        gradebook.modifyGrade("Jason", "A++");
        gradebook.printAllGrades();
        */
        Scanner reader = new Scanner(System.in);
        int operator = 10;
        while(operator != 0){
        System.out.print("Enter an action (1 to add student, 2 to modify grade, 3 to print all grades, 0 to exit: ");
        operator = reader.nextInt();
        reader.nextLine();
        if(operator == 1){
            System.out.println("Enter the students name you would like to add: ");
            
            String name = reader.nextLine();
            gradebook.addStudent(name);
        }
        else if(operator == 2){
            System.out.print("Enter the students name you would like change the grade for: ");
            String name = reader.nextLine();
            System.out.print("Enter the students grade (as a string e.g. A+): ");
            String grade = reader.nextLine();
            gradebook.modifyGrade(name, grade);
        }
        else if(operator == 3){
            System.out.println("Grades: ");
            gradebook.printAllGrades();
        }
        
        
    }
    }
    
}
