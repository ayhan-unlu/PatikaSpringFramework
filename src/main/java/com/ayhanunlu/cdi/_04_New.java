package com.ayhanunlu.cdi;

import com.ayhanunlu.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped

public class _04_New {

    //Produced
    @Produces
    public String producedData(@New StudentDto studentDto) {
        studentDto = StudentDto.builder().
                studentId(0L)
                .studentName("Student Name")
                .studentSurname("Student Surname")
                .build();
        return studentDto.getStudentName() + " " + studentDto.getStudentSurname();
    }

    @Getter
    @Inject
    private String consumingData;

}
