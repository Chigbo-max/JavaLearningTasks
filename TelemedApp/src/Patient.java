import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    protected String phone;
    private String id;
    private List<Appointment> appointments;

    public Patient(String name,String phone, String id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.appointments = new ArrayList<Appointment>();
    }

    public String getName() {
        return name;
    }
    public String getID() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void validatePhone(String phone) {
        if(phone.length() != 11) {
            throw new IllegalPhoneNumber("Phone number must be 11 digits");
        }
        this.phone = phone;
    }

    public static String findSpecialist(String specialist){
        return Specialists.findSpecialist(specialist);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void bookAppointment(String time, String specialist, String description){

        if(!findSpecialist(specialist).equalsIgnoreCase(specialist)) {
            throw new IllegalSpecialty("Specialist not found, please check the list of available specialists");
        }

        Doctor doctor = findDoctor(specialist);
        if(doctor.isBooked(time)){
            throw new IllegalAppointmentTime("Sorry, the doctor has been booked at this time");
        }
        Appointment appointment = new Appointment(time, specialist, description);
        appointments.add(appointment);
    }

    public Doctor findDoctor(String specialist){
        for(Doctor doctor : DoctorRegistrationPortal.doctors){
            if(doctor.getSpeciality().equals(specialist)){
                return doctor;
            }
        }
        return null;
    }



    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %s%n", "Name", name, "Phone", phone, "Id", id);
    }
}
