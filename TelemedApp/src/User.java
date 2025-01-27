import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String phone;
    private String id;
    private List<Appointment> appointments;

    public User(String name, String phone, String id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.appointments = new ArrayList<Appointment>();
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getId() {
        return id;
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void validatePhone(String phone) {
        if(phone.length() != 11) {
            throw new IllegalPhoneNumber("Phone number must be 11 digits");
        }
        this.phone = phone;
    }
}
