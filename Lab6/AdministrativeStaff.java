package com.company;

import java.time.LocalDate;
import java.util.Date;

public abstract class AdministrativeStaff extends Staff {
    public AdministrativeStaff(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone, Date joined, String[] education, String[] certification, String[] languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, phone, joined, education, certification, languages);
    }
}