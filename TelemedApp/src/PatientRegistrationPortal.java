import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PatientRegistrationPortal {

    public static List<Patient> patients = new ArrayList<Patient>();

    public Patient registerPatient(String firstName, String lastName, String phone) {
        if(firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty()) {
            throw new IllegalRegistration("First name or last name or phone number cannot be empty");
        }
        String name = firstName + " " + lastName;
        String id = generatePatientId();
        Patient newPatient = new Patient(name, phone, id);
        newPatient.validatePhone(phone);
        patients.add(newPatient);
        return newPatient;
    }

    public String generatePatientId() {
        Random rand = new Random();
        String prefix = "PA";
        String id = prefix + Math.abs(rand.nextLong() % 2_147_483_647);
        return id;
    }

    public List<Patient> getPatients() {
        return patients;
    }





}
