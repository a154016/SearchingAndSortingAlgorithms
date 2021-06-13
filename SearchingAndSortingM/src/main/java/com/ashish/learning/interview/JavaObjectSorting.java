package com.ashish.learning.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//This class shows how to sort primitive  arays , Wrapper  classes Object Arrays
public class JavaObjectSorting {

	public static void main(String args[]) {

		// sort primitive int array

		int[] intArray = { 5, 9, 1, 10 };
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));

		// sorting string arrays
		// System.out.println(Arrays.toString(strArray)));

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("D");
		strList.add("C");
		strList.add("B");
		Collections.sort(strList);
		for (String str : strList) {
			System.out.println(str);
		}
		
		ArrayList<Student> studentList= new ArrayList<Student>();
		studentList.add(new Student(101,"Ashish",75));
		studentList.add(new Student(102,"Ravi",65));
		studentList.add(new Student(103,"Rahul",95));
		studentList.add(new Student(104,"Vinay",55));
		
        Collections.sort(studentList);
        for(Student s:studentList)
        {
        	System.out.println(s.toString());
        }
        
        //CTE
        //Bound mismatch: The generic method sort(List<T>) of type Collections is not applicable for the arguments (ArrayList<Student>).
       //The inferred type Student is not a valid substitute for the bounded parameter <T extends Comparable<? super T>>
        Comparator<Student> marksComparator=( s1,  s2)->s1.getMarks()-s2.getMarks();
        Collections.sort(studentList,marksComparator);
        //Collections.sort(studentList);
        System.out.println("Sorting based on the comparartor interface");
        
        for(Student s:studentList)
        {
        	System.out.println(s.toString());
        }
        
	}
	
}
