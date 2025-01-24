public class Appointment {
    private String time;
    private String specialist;
    private String description;

    public Appointment(String time, String specialist, String description) {
        this.time = time;
        this.specialist = specialist;
        this.description = description;
    }
    public String getTime() {
        return time;
    }
    public String getSpecialist() {
        return specialist;
    }
    public String getDescription() {
        return description;
    }


}
