import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> completedClasses = new ArrayList<>();
        completedClasses.add("CS 1400");
        completedClasses.add("CS 1410");
        completedClasses.add("IT 1500");
        completedClasses.add("IT 1430");
        completedClasses.add("IT 2400");
        completedClasses.add("IT 3700");
        completedClasses.add("IT 1200");
        completedClasses.add("IT 1100");
        completedClasses.add("IT 2300");
        completedClasses.add("IT 4310");
        completedClasses.add("ENGL 3010");
        completedClasses.add("MATH 1040");

        ArrayList<String> classesNeeded = new ArrayList<>();
        String classesToProcess;
        boolean searchForClasses = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the classes needed for the degree");
        while (searchForClasses){
            classesToProcess = scanner.nextLine();
            if(classesToProcess.equals("!")){
                System.out.println("Exiting...\n");
                searchForClasses = false;
            }
            if(!completedClasses.contains(classesToProcess)){
                classesNeeded.add(classesToProcess);
            }
        }
        scanner.close();

        int totalClasses = classesNeeded.size();
        int completedClassesTotal = completedClasses.size();
        int everything = totalClasses + completedClassesTotal;
        System.out.println("You have " + completedClassesTotal + " completed classes\n");
        System.out.println(totalClasses + " additional classes are needed for completion for a total of " + everything + " classes\n");
        semestersToFinish(totalClasses);
        System.out.println("Courses needed listed below: \n");
        classesNeeded.remove("!");
        for (String className : classesNeeded) {
            System.out.println(className);
        }
    }
    public static void semestersToFinish (int classes) {
        int fourPerSemester = 4;
        int fivePerSemester = 5;
        double semestersFor4 = (double) classes / fourPerSemester;
        double semestersFor5 = (double) classes / fivePerSemester;
        System.out.println("You need " + semestersFor4 + " semesters to graduate taking 4 classes per semester\n");
        System.out.println("You need " + semestersFor5 + " semesters to graduate taking 5 classes per semester\n");
    }

}

