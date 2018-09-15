package pojo;

/**
 * @program: dszg
 * @Date: 2018/9/15 17:16
 * @Author: Mr.Zhang
 * @Description:
 */
public class Teacher {
    private int teacherId;
    private String name;
    private int workedYears;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkedYears() {
        return workedYears;
    }

    public void setWorkedYears(int workedYears) {
        this.workedYears = workedYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (teacherId != teacher.teacherId) return false;
        if (workedYears != teacher.workedYears) return false;
        if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + workedYears;
        return result;
    }
}
