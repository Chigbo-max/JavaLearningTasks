import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DoctorRegistrationTest {
    @Test
    public void testDoctorRegistrationWorks() {
        DoctorRegistrationPortal doctorRegistration = new DoctorRegistrationPortal();
        Doctor newDoctor = doctorRegistration.registerDoctor("ade", "williams", "09090987567", "General Doctor");
        Doctor doctor2 =  doctorRegistration.registerDoctor("wills", "wills", "08032352986", "General Surgeon");
        assertEquals(doctorRegistration.doctors.size(), 2);
    }

    @Test
    public void testThatAnExceptionIsThrownIfSpecialtyIsNotFound() {
        DoctorRegistrationPortal doctorRegistration = new DoctorRegistrationPortal();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,() -> doctorRegistration.registerDoctor("ade", "williams", "09090987567", "Gen Doc"));
        assertEquals(illegalArgumentException.getMessage(), "Specialist is not found, please check the list of available specialists properly");

    }

    @Test
    public void testPatientRegistrationThrowsExceptionIfStringIsEmpty_uponRegistering() {
        DoctorRegistrationPortal doctorRegistration = new DoctorRegistrationPortal();
        IllegalRegistration illegalRegistration = assertThrows(IllegalRegistration.class, ()-> doctorRegistration.registerDoctor("", "", "", ""));
        assertEquals(illegalRegistration.getMessage(), "First name or last name or phone number or specialty cannot be empty");
    }
}
