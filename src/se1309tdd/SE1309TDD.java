/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1309tdd;

import core.GradeChecker;

/**
 *
 * @author pc
 */
public class SE1309TDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Thien Bao");
        System.out.println("10:" + GradeChecker.checkGrade(10));
        System.out.println("10:" + GradeChecker.checkGrade(2));
        System.out.println("10:" + GradeChecker.checkGrade(10));
        System.out.println("10:" + GradeChecker.checkGrade(10));
        System.out.println("10:" + GradeChecker.checkGrade(22));
        System.out.println("10:" + GradeChecker.checkGrade(4));
        System.out.println("This is 8th");
    }

    
}
