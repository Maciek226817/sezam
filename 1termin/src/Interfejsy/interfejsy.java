package Interfejsy;

//import zadanie1.Student;

import java.util.Comparator;

public class interfejsy {
    public Student clone() throws CloneNotSupportedException{
        Student cloned = (Student) super.clone();
        cloned.dateofsort = (Date) dateofsort.clone();
        return cloned;

    }

    import java.util.Comparator;

    public class NamesComparator implements Comparator<Student>, Comparable<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.getName().compareTo(b.getName());
        }

    }

    public int compareTo(Student other)
    {
        if (pobory < other.pobory) {
            return -1;
        }
        if (pobory > other.pobory) {
            return 1;
        }
        return 0;
    }
//    @Override
//        public int compareTo(Osoba o) {
//            int porownanieNazwisk = this.nazwisko.compareTo(o.nazwisko);
//            if (porownanieNazwisk != 0) {
//                return porownanieNazwisk;
//            }
//            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
//        }

    @Override
    public int compareTo(FootballPlayer anotherPlayer) {
        return Integer.compare(this.goalsScored, anotherPlayer.goalsScored);

}
