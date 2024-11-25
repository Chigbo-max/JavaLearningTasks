package EnumsTask;

public enum GeoPoliticalZones {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauch","Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    SOUTH_SOUTH("Akwa-ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers");

    private String[] states;

    GeoPoliticalZones(String... states){
        this.states = states;
    }

    public String[] getState() {
        return this.states;
    }

    public void setStates(String... states){
        this.states = states;
    }

    public static String findState(String state){

        validate(state);
        String foundState = " ";
        for(GeoPoliticalZones zones : GeoPoliticalZones.values()){
            for(var states: zones.getState()){
                if(state.equals(states)){
                    foundState = zones.toString();
                }

            }
        }
        return foundState;
    }

    private static String validate(String state){
        boolean matchState = false;
        for(GeoPoliticalZones zones : GeoPoliticalZones.values()){
            for(var states: zones.getState()){
                if(state.equals(states)){
                    matchState = true;
                    break;
                }

            }
        }
        if(!matchState){
            throw new IllegalArgumentException("State not found");
        }
        return state;
    }


}

