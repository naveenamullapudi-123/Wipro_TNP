package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {

    public String validate(Student s)
            throws NullStudentObjectException,
            NullNameException,
            NullMarksArrayException {

        if (s == null)
            throw new NullStudentObjectException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();

        return "VALID";
    }

    public String findGrades(Student s) {

        int sum = 0;

        for (int mark : s.getMarks()) {

            if (mark < 35)
                return "F";

            sum += mark;
        }

        if (sum < 150)
            return "C";

        else if (sum < 200)
            return "B";

        else if (sum < 250)
            return "A";

        else
            return "A+";
    }

}