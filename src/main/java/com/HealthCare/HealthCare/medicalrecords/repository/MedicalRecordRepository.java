package com.HealthCare.HealthCare.medicalrecords.repository;

import com.HealthCare.HealthCare.medicalrecords.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    List<MedicalRecord> findByPatientPatientId(Long patientId);


}
