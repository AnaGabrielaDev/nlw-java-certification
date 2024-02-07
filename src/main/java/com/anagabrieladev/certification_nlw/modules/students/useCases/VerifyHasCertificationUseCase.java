package com.anagabrieladev.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.anagabrieladev.certification_nlw.modules.students.dto.VerifyHasCertificationDto;

@Service
public class VerifyHasCertificationUseCase {
    public boolean execute(VerifyHasCertificationDto dto) {
        if (dto.getEmail().contains("@")) {
            return true;
        }

        return false;
    }
}
