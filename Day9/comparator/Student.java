package Day9.comparator;

public class Student {
    String name;
    int rollno;
    int maths;
    int c;
    int physics;
    public Student(String name, int rollno, int maths, int c, int physics) {
        this.name = name;
        this.rollno = rollno;
        this.maths = maths;
        this.c = c;
        this.physics = physics;
    }

    public double getAverage() {
        return ((double) (maths + c + physics) / 3);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + ", maths=" + maths + ", c=" + c + ", physics=" + physics
                + ", getAverage()=" + getAverage() + "]";
    }
    
}