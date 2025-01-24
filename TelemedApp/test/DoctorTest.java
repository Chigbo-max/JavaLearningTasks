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
}
