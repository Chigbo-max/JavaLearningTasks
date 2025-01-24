public enum Specialists {
    GENERAL_DOCTOR("General Doctor"),
    ORTHOPEDIC("Orthopedic"),
    GENERAL_SURGEON("General Surgeon"),
    DENTIST("Dentist"),
    GYNECOLOGIST("Gynecologist"),
    OPTICIAN("Optician"),;

    private String[] specialist;

    Specialists(String... specialist) {
        this.specialist = specialist;
    }

    public String[] getSpecialist() {
        return specialist;
    }

    public static String findSpecialist(String specialist) {
        String foundSpecialist = "";
        for(Specialists doctors : Specialists.values()) {
            for(var specialists : doctors.getSpecialist()) {
                if (specialist.equalsIgnoreCase(specialists)) {
                    foundSpecialist = specialists.toString();
                    return foundSpecialist;
                }
            }
        }
        throw new IllegalArgumentException("Specialist is not found, please check the list of available specialists properly");
    }

    public static String displaySpecialists() {
        String displayedSpecialists = "";
        for(Specialists doctors : Specialists.values()) {
            for(var specialists : doctors.getSpecialist()) {
                displayedSpecialists += specialists +"\n";
            }
        }
        return displayedSpecialists;
    }
}


