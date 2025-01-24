import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DoctorRegistrationPortal {
    public static List<Doctor> doctors = new ArrayList<>();

    public Doctor registerDoctor(String firstName, String lastName,String phone, String specialty) {
        if(firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || specialty.isEmpty()) {
            throw new IllegalRegistration("First name or last name or phone number or specialty cannot be empty");
        }
        Specialists.findSpecialist(specialty);
        String title ="Dr.";
        String name = title + firstName + " " + lastName;
        String id = generateDoctorId();
        Doctor newDoctor = new Doctor(name, phone, id, specialty);
        doctors.add(newDoctor);
        return newDoctor;
    }

    public String generateDoctorId() {
        Random rand = new Random();
        String prefix = "DD";
        String id = prefix + Math.abs(rand.nextLong() % 2_147_483_647);
        return id;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public String getDoctorNameAndSpeciality() {
        String result = "";

        for (Doctor doctor : doctors) {
            String doctorName = doctor.getName();
            String doctorSpeciality = doctor.getSpeciality();
            result += String.format("%s: %s%n %s: %s%n%n", "Doctor Name", doctorName, "Speciality", doctorSpeciality);
        }
        return result;
    }

}
