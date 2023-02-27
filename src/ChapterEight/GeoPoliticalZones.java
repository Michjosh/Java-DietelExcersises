package ChapterEight;

public enum GeoPoliticalZones {
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yaba"}),
    NORTH_WEST(new String[]{"Kaduna", "Katsina", "Kanu", "Kebbi", "Sokoto", "Jigawa", "Zamfara",}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross-Rivers", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    public final String[] states;

    GeoPoliticalZones(String[] states) {
        this.states = states;
    }

    public static GeoPoliticalZones getState(String userInput) {
        for (GeoPoliticalZones zone : GeoPoliticalZones.values()) {
            for (String i : zone.states) {
                if (i.equals(userInput))
                    return zone;
            }
        }
        return null;
    }
}
