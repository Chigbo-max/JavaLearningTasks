import java.util.ArrayList;
import java.util.List;

public class Doctor extends Patient{
    private String speciality;
    private static List<Appointment> appointments = new ArrayList<>();
    private String bookedTime;

    public Doctor(String name, String phone, String id,String speciality) {
        super(name,phone,id);
        this.speciality = speciality;
        this.appointments = new ArrayList<>();
        this.bookedTime = "";
    }

    public String getSpeciality() {
        return speciality;
    }


    public String findPatient(String patientId) {
        for(Patient patient: PatientRegistrationPortal.patients){
            if(patient.getID().equals(patientId)){
                return patient.getName();
            }
        }
        throw new IllegalArgumentException("Patient not found");
    }

    public String bookedTime() {
        return bookedTime;
    }

    public void setBookedTime(String bookedTime) {
        this.bookedTime = bookedTime;
    }

    public static boolean isBooked(String bookedTime) {
        for(Appointment appointment: appointments){
            if(appointment.getTime().equals(bookedTime)){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }



    @Override
    public String toString() {
        return String.format("%s%s: %s%n",super.toString(), "Specialist", speciality);
    }

}

