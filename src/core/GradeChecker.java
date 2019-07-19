package core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class GradeChecker {

    public static char checkGrade(double grade) {

        if (grade < 10 && grade >= 5) {
            return 'P';
        } 
//        else if (grade >= 0 && grade < 5) {
//            return 'F';
//        }
        
        return 'N';
    }
}
