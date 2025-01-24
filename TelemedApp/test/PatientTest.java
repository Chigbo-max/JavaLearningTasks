import org.junit.Test;

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
        patient.bookAppointment("5PM", "General Surgeon", "need a surgery");
        assertEquals(patient.getAppointments().size(), 1);

    }

    @Test
    public void testThatExceptionIsThrownIfBooked() {
        DoctorRegistrationPortal newRegistration = new DoctorRegistrationPortal();
        Doctor doctor = newRegistration.registerDoctor("ade", "wills", "09012312345", "General Surgeon");
        PatientRegistrationPortal patientRegistration = new PatientRegistrationPortal();
        Patient patient = patientRegistration.registerPatient("ade", "wills", "09012312345");
        doctor.setBookedTime("5PM");
        IllegalAppointmentTime illegalAppointmentTime = assertThrows(IllegalAppointmentTime.class, ()-> patient.bookAppointment("5PM", "General Surgeon", "need a surgery"));
        assertEquals(illegalAppointmentTime.getMessage(), "Sorry, the doctor has been booked at this time");

    }

}
