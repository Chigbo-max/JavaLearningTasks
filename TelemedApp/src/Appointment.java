public class Appointment {
    private String time;
    private String date;
    private String specialist;
    private String description;
    private String patientId;

    public Appointment(String date, String time, String specialist, String description, String patientId) {
        this.date = date;
        this.time = time;
        this.specialist = specialist;
        this.description = description;
        this.patientId = patientId;
    }
    public String getTime() {
        return time;
    }
    public String getDate(String date) {
        return date;
    }
    public String getSpecialist() {
        return specialist;
    }
    public String getDescription() {
        return description;
    }
    public String getPatientId() {return patientId;}


}
