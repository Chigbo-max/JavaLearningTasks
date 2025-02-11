//import java.util.List;
//import java.util.Scanner;
//
//import static java.lang.System.exit;
//
//public class Main {
//
//    public static PatientRegistrationPortal patientRegistrationPortal = new PatientRegistrationPortal();
//    public static DoctorRegistrationPortal doctorRegistrationPortal = new DoctorRegistrationPortal();
//    private static Patient loggedInUser;
//
//
//    public static void main(String[] args) {
//
//        goToMenu();
//        accessDashboard();
//    }
//
//        public static void goToMenu() {
//            String menu = """
//
//            WELCOME TO ONWARD HOSPITAL
//            1 ->Register
//            2 ->Login
//            3 ->Logout
//
//            """;
//
//            print(menu);
//            inputMenu();
//        }
//
//
//
//
//    public static void inputMenu() {
//        try {
//            char choice = input("Select a number if you would like to register or login to logout?").charAt(0);
//
//            switch (choice) {
//                case '1':
//                    register();
//                case '2':
//                    login();
//                case '3':
//                    logOut();
//                default:
//                    print("Invalid input try again");
//                    goToMenu();
//            }
//        }
//        catch (Exception e) {
//            print("Invalid input try again");
//        }
//        finally {
//            goToMenu();
//        }
//
//    }
//
//
//        public static void register() {
//            try {
//                String firstName = input("Enter your first name: ");
//                String lastName = input("Enter your last name: ");
//                String phoneNumber = input("Enter your phone number(11 digits): ");
//
//                var patient = patientRegistrationPortal.registerPatient(firstName, lastName, phoneNumber);
//
//                print("Registration successful");
//                print("Kindly find your ID:" + patient.getID());
//                print("Please proceed to login");
//                goToMenu();
//            }
//
//        catch(IllegalPhoneNumber p){
//            print(p.getMessage());
//        }
//            catch(Exception e){
//                print("Invalid input try again");
//            }
//            finally {
//                goToMenu();
//            }
//            }
//
//
//        public static void login () {
//            String patientId = input("Enter your ID: ");
//            Patient patient =  validateId(patientId);
//
//            if (patient != null) {
//                loggedInUser = patient;
//                print("Login successful");
//                accessDashboard();
//            } else {
//                print("Invalid login details entered, please try again if you are registered");
//                goToMenu();
//            }
//        }
//
//
//        public static Patient validateId(String id){
//            for(Patient patient : patientRegistrationPortal.getPatients()) {
//                if(patient.getID().equals(id)) {
//                    return patient;
//                }
//            }
//            return null;
//        }
//
//        public static void logOut() {
//            print("Thanks for using our App");
//            exit(0);
//        }
//
//
//        public static void accessDashboard() {
//            String dashboard = """
//
//                    WELCOME TO ONWARD HOSPITAL
//                    1 -> See list of specialists
//                    2 -> Book a specialist
//                    3 -> View appointment
//                    4 -> Get your ID
//                    5 -> Logout
//
//                    """;
//
//            print(dashboard);
//            inputDashboard();
//        }
//
//        public static void inputDashboard(){
//                try {
//                    char choice = input("Enter your choice: ").charAt(0);
//                    switch (choice) {
//                        case '1': seeSpecialists(); break;
//                        case '2':
//                            bookASpecialist(); break;
//                        case '3':
//                            viewAppointment(); break;
//                        case '4':
//                            getYourId(); break;
//                            case '5': logOut();
//                        default:
//                            print("Invalid input try again");
//                            goToMenu();
//                    }
//                }
//                    catch (Exception e){
//                        print("Invalid input try again");
//                    }
//                finally{
//                        accessDashboard();
//                    }
//            }
//
//    public static void seeSpecialists() {
//    print(Specialists.displaySpecialists());
//    }
//
//    public static void bookASpecialist() {
//        try {
//            if (loggedInUser == null) {
//                print("Please login first to see a specialist");
//                return;
//            }
//            String time = input("Enter preferred time e.g 5PM: ");
//            String specialist = input("Enter specialist you want to book e.g General Surgeon: ");
//            String description = input("Enter a brief description of your complaint: e.g headache ");
//
//            String trimmedTime = time.trim().replaceAll("\\s+", "").toUpperCase();
//            loggedInUser.bookAppointment(trimmedTime.toUpperCase(), specialist, description);
//            print("appointment successfully booked");
//
//        } catch (IllegalAppointmentTime illegalAppointmentTime) {
//            print(illegalAppointmentTime.getMessage());
//        }
//        catch(IllegalSpecialty illegalSpecialty){
//            print(illegalSpecialty.getMessage());
//        }
//        catch(Exception e){
//            print("Invalid input try again");
//        }
//        finally{
//            accessDashboard();
//        }
//    }
//
////import java.time.format.DateTimeFormatter;
//
/// /DateTimeFormatter readableFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy, h:mm a");
/// /String formattedDateTime = doctor.getAppointmentTime().format(readableFormat);
/// /print(formattedDateTime);
//
//        public static void viewAppointment(){
//            if(loggedInUser == null) {
//                print("Please login first to view appointment");
//                return;
//            }
//            for(Appointment patient: loggedInUser.getAppointments()){
//                print("Time: " + patient.getTime() + "\n" + "Description: " + patient.getDescription() + " \n" + "Specialist: " + patient.getSpecialist() + "\n" + "Name Of Specialist: " );
//                print(loggedInUser.findDoctorName(patient.getSpecialist()));
//            }
//
//
//
//            accessDashboard();
//        }
//
//        public static void getYourId() {
//            if (loggedInUser == null) {
//                print("Please login first to view your ID");
//            }
//            print("Kindly find your userId: " + loggedInUser.getID());
//
//            accessDashboard();
//        }
//
//
//
//
//    public static void registerDoctors(){
//        doctorRegistrationPortal.registerDoctor("Alex", "Chibuzor", "09012389457", "Dentist");
//        doctorRegistrationPortal.registerDoctor("Alex", "Chibuzor", "09012389457", "Gynecologist");
//
//        doctorRegistrationPortal.registerDoctor("Alex", "Chibuzor", "09012389457", "Optician");
//        doctorRegistrationPortal.registerDoctor("Alex", "Chibuzor", "09012389457", "Gynecologist");
//        doctorRegistrationPortal.registerDoctor("Alex", "Chibuzor", "09012389457", "General Surgeon");
//        doctorRegistrationPortal.registerDoctor("Alex", "Chibuzor", "09012389457", "General Doctor");
//
//        List<Doctor> doctors = doctorRegistrationPortal.getDoctors();
////        doctors.get(doctors.size()-6).setBookedTime("5PM");
////        doctors.get(doctors.size()-5).setBookedTime("5PM");
////        doctors.get(doctors.size()-4).setBookedTime("5PM");
////        doctors.get(doctors.size()-3).setBookedTime("5PM");
////        doctors.get(doctors.size()-2).setBookedTime("5PM");
////        doctors.get(doctors.size()-1).setBookedTime("5PM");
//
//    }
//
//
//
//    private static void print(String message) {
//        System.out.println(message);
//    }
//
//    private static String input(String prompt) {
//        print(prompt);
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine().trim();
//    }
//
//
//
//}