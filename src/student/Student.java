package student;

public class Student {
    private String firstName;
    private String lastName;
    private int rate;
    private float heightOfStudent;

    private String group;
    private String course;
    private boolean isCommercial;
    private String university;
    private float scholarship;

    public static int amountOfStudents;

    protected float averagePoint;
    protected int birthYear;

    public Student() {
        amountOfStudents++;
    }

    public Student(String firstName, String lastName, int rate, float heightOfStudent) {
        this(firstName,lastName,rate, heightOfStudent, null, null,
                false,null, 0.0f,0.0f,0);
        amountOfStudents++;
    }

    public Student(String firstName, String lastName, int rate, float heightOfStudent, String group, String course,
                   boolean isCommercial, String university, float scholarship, float averagePoint, int birthYear) {
        setValues(firstName, lastName, rate, heightOfStudent, group, course, isCommercial, university, scholarship,
                averagePoint, birthYear);
        amountOfStudents++;
    }

    public void resetValues(String firstName, String lastName, int rate, float heightOfStudent, String group,
                            String course, boolean isCommercial, String university, float scholarship,
                            float averagePoint, int birthYear) {
        setValues(firstName, lastName, rate, heightOfStudent, group, course, isCommercial, university, scholarship,
                averagePoint, birthYear);
    }

    private void setValues(String firstName, String lastName, int rate, float heightOfStudent, String group,
                            String course, boolean isCommercial, String university, float scholarship,
                            float averagePoint, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rate = rate;
        this.heightOfStudent = heightOfStudent;
        this.group = group;
        this.course = course;
        this.isCommercial = isCommercial;
        this.university = university;
        this.scholarship = scholarship;
        this.averagePoint = averagePoint;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public float getHeightOfStudent() {
        return heightOfStudent;
    }

    public void setHeightOfStudent(float heightOfStudent) {
        this.heightOfStudent = heightOfStudent;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean commercial) {
        isCommercial = commercial;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }

    public float getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(float averagePoint) {
        this.averagePoint = averagePoint;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static void printStaticAmountOfStudents() {
        System.out.println("AmountOfStudents: " + Student.amountOfStudents);
    }
    public void printAmountOfStudents() {
        System.out.println("AmountOfStudents: " + amountOfStudents);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rate=" + rate +
                ", heightOfStudent=" + heightOfStudent +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", isCommercial=" + isCommercial +
                ", university='" + university + '\'' +
                ", scholarship=" + scholarship +
                ", averagePoint=" + averagePoint +
                ", birthYear=" + birthYear +
                '}';
    }
}
