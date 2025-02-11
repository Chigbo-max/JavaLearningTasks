import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    private String name;
    private String phone;
    private String id;
    private List<Appointment> appointments;

    public Patient(String name,String phone, String id) {
        super(name, phone, id);
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


    @Override
    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void bookAppointment(String dateInput, String timeInput, String specialist, String description){

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime appointmentDateAndTime = convertDateAndTimeString(dateInput, timeInput);
        LocalDateTime maximumValidDate = today.plusDays(30);
        Specialists.findSpecialist(specialist);
        validateTimeAndDateExtent(appointmentDateAndTime, today, maximumValidDate);
        Doctor doctor = validateDoctorAvailability(specialist);
        Appointment appointment = new Appointment(dateInput, timeInput, specialist, description, this.getID());
        appointments.add(appointment);
        doctor.addAppointment(appointment);
        doctor.setBookedTime(dateInput, timeInput);
    }

    private Doctor validateDoctorAvailability(String specialist) {
        Doctor doctor = findDoctor(specialist);
        if(doctor.isDoctorBooked()) {
            throw new IllegalAppointmentTime("Sorry, the doctor has been booked at this time");
        }
        return doctor;
    }

    private static LocalDateTime convertDateAndTimeString(String dateInput, String timeInput) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");

        LocalDate localDate = LocalDate.parse(dateInput, dateFormatter);
        LocalTime localTime = LocalTime.parse(timeInput, timeFormatter);

        LocalDateTime appointmentDateAndTime = LocalDateTime.of(localDate, localTime);
        return appointmentDateAndTime;
    }

    private static void validateTimeAndDateExtent(LocalDateTime appointmentDateAndTime, LocalDateTime today, LocalDateTime maximumValidDate) {
        if(appointmentDateAndTime.toLocalDate().isBefore(today.toLocalDate()) || appointmentDateAndTime.isAfter(maximumValidDate)) {
            throw new IllegalArgumentException("Date and time cannot be in the past or exceed 30days from today");
        }
    }

    public String findDoctorName(String specialist){
        for(Doctor doctor : DoctorRegistrationPortal.doctors){
            if(doctor.getSpeciality().equals(specialist)){
                return doctor.getName();
            }
        }
        throw new IllegalArgumentException("Sorry, we do not have this specialist");
    }

    public Doctor findDoctor(String specialist){
        for(Doctor doctor : DoctorRegistrationPortal.doctors){
            if(doctor.getSpeciality().equals(specialist)){
                return doctor;
            }
        }
        throw new IllegalArgumentException("Sorry, we do not have this specialist");
    }





    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %s%n", "Name", name, "Phone", phone, "Id", id);
    }
}
