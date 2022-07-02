public enum StudyProfile {
    mathematic("Математик"),
    physic("Физик"),
    radioman("Радист");

    private String title;

    StudyProfile(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
