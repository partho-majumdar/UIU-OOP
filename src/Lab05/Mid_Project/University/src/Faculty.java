package Lab05.Mid_Project.University.src;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {
    }

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public int getFacultyId() {
        return this.facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return this.facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyPosition() {
        return this.facultyPosition;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId = " + facultyId +
                ", facultyName = '" + facultyName + '\'' +
                ", facultyPosition = '" + facultyPosition + '\'' +
                '}';
    }
}
