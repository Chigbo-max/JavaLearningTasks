import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PatientRegistrationTest {

    @Test
    public void testPatientRegistrationWorks() {
        PatientRegistrationPortal patientRegistration = new PatientRegistrationPortal();
        Patient newPatient = patientRegistration.registerPatient("ade", "williams", "09090987567");
        Patient newPatient2 = patientRegistration.registerPatient("Mike", "wills", "09090987567");
        assertEquals(patientRegistration.patients.size(), 2);
    }

    @Test
    public void testPatientRegistrationThrowsExceptionIfStringIsEmpty_uponRegistering() {
        PatientRegistrationPortal patientRegistration = new PatientRegistrationPortal();
        IllegalRegistration illegalRegistration = assertThrows(IllegalRegistration.class, ()-> patientRegistration.registerPatient("", "", ""));
        assertEquals(illegalRegistration.getMessage(), "First name or last name or phone number cannot be empty");

    }
}
