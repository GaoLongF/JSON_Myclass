package Students;

public class Students
{
    private String name;
    private int id;
    private int grade;
    private int birthday;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Students()
    {

    }

    public Students(String name, int id, int grade, int birthday,String sex) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.birthday = birthday;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
