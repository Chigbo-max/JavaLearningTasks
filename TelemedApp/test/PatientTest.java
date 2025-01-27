import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PatientTest {
    @Test
    public void testThatToStringWorks() {
        Patient patient = new Patient("ade", "08023434567", "11111");
        System.out.println(patient);
    }

    @Test
    public void testThatPhoneNumberIsNotMoreThan11Digits() {
        Patient patient = new Patient("ade", "080456789999", "11111");
        IllegalPhoneNumber illegalPhoneNumber = assertThrows(IllegalPhoneNumber.class, () -> patient.validatePhone(patient.getPhone()));
        assertEquals(illegalPhoneNumber.getMessage(), "Phone number must be 11 digits");

    }

    @Test
    public void testThatAnAppointmentIsCreated() {
        DoctorRegistrationPortal newRegistration = new DoctorRegistrationPortal();
        Doctor doctor = newRegistration.registerDoctor("ade", "wills", "09012312345", "General Surgeon");
        PatientRegistrationPortal patientRegistration = new PatientRegistrationPortal();
        Patient patient = patientRegistration.registerPatient("ade", "wills", "09012312345");
        patient.bookAppointment("20-03-2025", "3:00 PM", "General Doctor", "hhhh");
        assertEquals(patient.getAppointments().size(), 1);

    }

    @Test
    public void testThatExceptionIsThrownIfAppointmentDateIsWrong() {
        DoctorRegistrationPortal newRegistration = new DoctorRegistrationPortal();
        Doctor doctor = newRegistration.registerDoctor("ade", "wills", "09012312345", "General Surgeon");
        PatientRegistrationPortal patientRegistration = new PatientRegistrationPortal();
        Patient patient = patientRegistration.registerPatient("ade", "wills", "09012312345");
        doctor.setBookedTime("22-01-2024", "2:00 PM");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> patient.bookAppointment("20-03-2025", "3:00 PM", "General Doctor", "hhhh"));
        assertEquals(exception.getMessage(), "Date and time cannot be in the past or exceed 30days from today");


    }

    @Test
    public void testThatExceptionIsThrownIfSpecialistIsNotFound() {
        DoctorRegistrationPortal newRegistration = new DoctorRegistrationPortal();
        Doctor doctor = newRegistration.registerDoctor("ade", "wills", "09012312345", "General Surgeon");
        PatientRegistrationPortal patientRegistration = new PatientRegistrationPortal();
        Patient patient = patientRegistration.registerPatient("ade", "wills", "09012312345");
        doctor.setBookedTime("22-01-2024", "2:00 PM");
        IllegalSpecialty illegalSpecialty = assertThrows(IllegalSpecialty.class, () -> patient.bookAppointment("26-01-2025", "3:00 PM", "General", "hhhh"));
        assertEquals(illegalSpecialty.getMessage(), "Specialist is not found, please check the list of available specialists properly");

    }

    @Test
    public void testThatExceptionIsThrownIfDoctorIsBooked() {
        DoctorRegistrationPortal newRegistration = new DoctorRegistrationPortal();
        Doctor doctor = newRegistration.registerDoctor("ade", "wills", "09012312345", "General Surgeon");
        PatientRegistrationPortal patientRegistration = new PatientRegistrationPortal();
        Patient patient = patientRegistration.registerPatient("ade", "wills", "09012312345");
        Patient patient2 = patientRegistration.registerPatient("ade", "wills", "09012312345");
        patient2.bookAppointment("26-01-2025", "2:00 PM", "General Surgeon", "hhhh");

        IllegalAppointmentTime illegalAppointmentTime = assertThrows(IllegalAppointmentTime.class, () -> patient.bookAppointment("26-01-2025", "3:00 PM", "General Surgeon", "hhhh"));
        assertEquals(illegalAppointmentTime.getMessage(), "Sorry, the doctor has been booked at this time");

    }



}
