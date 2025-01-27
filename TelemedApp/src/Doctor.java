import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends User{
    private String speciality;
    private List<Appointment> appointments = new ArrayList<>();
    private List<LocalDateTime> appointmentDates = new ArrayList<>();
    private LocalDateTime appointmentTime;
    private boolean isBooked = false;

    public Doctor(String name, String phone, String id,String speciality) {
        super(name,phone,id);
        this.speciality = speciality;
        this.appointments = new ArrayList<>();
        this.appointmentDates = new ArrayList<>();
        this.appointmentTime = LocalDateTime.now();
        this.isBooked = false;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isDoctorBooked() {
        return isBooked;
    }

    public String findPatient(String patientId) {
        for(Patient patient: PatientRegistrationPortal.patients){
            if(patient.getID().equals(patientId)){
                return patient.getName();
            }
        }
        throw new IllegalArgumentException("Patient not found");
    }


    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public List<LocalDateTime>  getAppointmentDate() {
        return appointmentDates;
    }

    public void setBookedTime(String dateInput, String timeInput) {
        validateIfBooked(dateInput, timeInput);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:mm a");
        LocalDate appointmentDate = LocalDate.parse(dateInput, dateFormat);
        LocalTime appointTime = LocalTime.parse(timeInput, timeFormat);
        this.appointmentTime = LocalDateTime.of(appointmentDate, appointTime);
        isBooked = true;
        appointmentDates.add(this.appointmentTime);

    }

    private void validateIfBooked(String dateInput, String timeInput) {
        if(isBookedAtThisTime(dateInput, timeInput)) {
            throw new IllegalAppointmentTime("Sorry, the doctor has been booked at this time");
        }
    }

    public boolean isBookedAtThisTime(String dateInput, String timeInput) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:mm a");
        LocalDate appointmentDate = LocalDate.parse(dateInput, dateFormat);
        LocalTime appointmentTime = LocalTime.parse(timeInput, timeFormat);
        LocalDateTime checkTime = LocalDateTime.of(appointmentDate, appointmentTime);
        return appointmentDates.contains(checkTime);
    }

    public void cancelAppointment(String patientId) {
        appointments.removeIf(appointment -> appointment.getPatientId().equals(patientId));
        for(Patient patient: PatientRegistrationPortal.patients){
            if(patient.getID().equals(patientId)){
                patient.getAppointments().removeIf(appointment -> appointment.getPatientId().equals(patientId));
                break;
            }
        }
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

