package org.example;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor technologyDean =new Supervisor("Dr.Mike", "Dean of Technology");
        Supervisor chairOfMathDept = new Supervisor("Dr.John", "Chair of Math");
        Supervisor chairOfCompScience = new Supervisor("Dr.Jack", "Dean of Sociology");

        Professor mathProf1 = new Professor("Math 1", "Adjunct",302);
        Professor mathProf2 = new Professor("Math 2", "Associate",303);

        Professor cseProf1 = new Professor("CSE 1", "Adjunct",502);
        Professor cseProf2 = new Professor("CSE 2", "Professor",506);
        Professor cseProf3 = new Professor("CSE 3", "Professor",508);

        technologyDean.add(chairOfMathDept);
        technologyDean.add(chairOfCompScience);

        /* Professors of maths directly reports to chair of math */
        chairOfMathDept.add(mathProf1);
        chairOfMathDept.add(mathProf2);

        /* Professors of maths directly reports to chair of math */
        chairOfCompScience.add(cseProf1);
        chairOfCompScience.add(cseProf2);
        chairOfCompScience.add(cseProf3);

        //printing details
        System.out.println("***Composite Pattern Demo****");
        System.out.println("\nThe college has the following structure\n");

        System.out.println(technologyDean.getDetails());
        List<Faculty> facultyOfTechnology = technologyDean.getMyFaculty();

        for(int i=0;i<facultyOfTechnology.size();i++){
            System.out.println("\t"+ facultyOfTechnology.get(i).getDetails());
        }

        List<Faculty> mathProfessors = chairOfMathDept.getMyFaculty();

        for(int i=0;i<mathProfessors.size();i++){
            System.out.println("\t\t"+ mathProfessors.get(i).getDetails());
        }

        List<Faculty> cseProfessors = chairOfMathDept.getMyFaculty();

        for(int i=0;i<cseProfessors.size();i++){
            System.out.println("\t\t"+ cseProfessors.get(i).getDetails());
        }
        chairOfCompScience.remove(cseProf2);

        System.out.println("\n After CSE Prof 2 leaving the organization-");

        cseProfessors = chairOfCompScience.getMyFaculty();
        for(int i=0;i<cseProfessors.size();i++){
            System.out.println("\t\t"+ cseProfessors.get(i).getDetails());
        }









    }
}
