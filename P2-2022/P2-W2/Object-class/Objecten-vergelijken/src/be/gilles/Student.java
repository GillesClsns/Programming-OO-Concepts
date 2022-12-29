package be.gilles;

import java.util.Objects;

public class Student {

    private final String naam;
    private final int nummer;

    public Student(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nummer == student.nummer && naam.equals(student.naam);
    }

}
