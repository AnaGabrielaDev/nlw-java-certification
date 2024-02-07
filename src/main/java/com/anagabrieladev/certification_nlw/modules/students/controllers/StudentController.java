package com.anagabrieladev.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anagabrieladev.certification_nlw.modules.students.dto.VerifyHasCertificationDto;
import com.anagabrieladev.certification_nlw.modules.students.useCases.VerifyHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private VerifyHasCertificationUseCase verifyHasCertificationUseCase;

    @PostMapping("/certification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDto dto) {
        boolean res = this.verifyHasCertificationUseCase.execute(dto);
        if (res) {
            return "isEmail";
        }

        return "isNotAnEmail";
    }
}
