/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import core.GradeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class GradeTest {
    
    @Test
    public void testGrade(){
        //using color inteads of sout
        //each test used to test each function in core code
        assertEquals('P', GradeChecker.checkGrade(10));
        assertEquals('P', GradeChecker.checkGrade(5));
        assertEquals('F', GradeChecker.checkGrade(1));
        assertEquals('F', GradeChecker.checkGrade(3));
        assertEquals('d', GradeChecker.checkGrade(-1));
    }
    
    
}
