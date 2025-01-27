import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DoctorTest {
    @Test
    public void test() {
        Doctor doctor = new Doctor("willy", "09045678999", "12345", "General Doc");
        System.out.println(doctor);
    }

    @Test
    public void testThatPhoneNumberIsNotMoreThan11Digits() {
        Doctor doctor = new Doctor("willy", "090456789999", "12345", "General Doc");
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> doctor.validatePhone(doctor.getPhone()));
        assertEquals(illegalArgumentException.getMessage(), "Phone number must be 11 digits");
    }

    @Test
    public void testThatErrorIsThrown_IfDoctorCannotFindPatient(){
        Doctor doctor = new Doctor("willy", "090456789999", "12345", "General Doc");
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> doctor.findPatient("12345"));
        assertEquals(illegalArgumentException.getMessage(), "Patient not found");

    }

    @Test
    public void testThatDoctorCanCancel_AnAppointment() {
        DoctorRegistrationPortal newRegistration = new DoctorRegistrationPortal();
        Doctor doctor = newRegistration.registerDoctor("ade", "wills", "09012312345", "General Surgeon");
        Patient patient2 = new Patient("ade", "09023456789", "11112");
        patient2.bookAppointment("22-02-2025", "5:00 PM", "General Surgeon", "aaaa");
        doctor.cancelAppointment(patient2.getID());
        assertEquals(doctor.getAppointments().size(), 0);


    }
}
