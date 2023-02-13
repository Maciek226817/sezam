package Interfejsy;

public class nazewnictwo {

//
//    W defnicji metody zadeklaruj, że klasa T
//    musi implementować generyczny interfejs Comparable.
//public static <T extends Comparable<T>> boolean isSorted(T[] array)

//    napisz generyczną statyczną metodę print, której argumentem jest dowolny obiekt
//    implementujący interfejs Iterable.
//public static <T> void print(Iterable<T> iterable)
//
//    napisz statyczną generyczną metodą ArrayUtil.removeRepeatedElements, która zwraca obiekt
//    klasy ArrayList zawierający niepowtarzające się elementy tablicy obiektów klasy T podanej jako
//    argument metody (zwracany obiekt stanowi zbiór reprezentujący tablicę elementów podaną jako
//            argument metody). Klasa T może implementować generyczny interefejs Comparable

//    public static <T extends Comparable<T>> ArrayList<T> removeRepeatedElements(T[] array)
//Set<T> set = new HashSet<>();
//    for (T t : array) {
//        set.add(t);
//    }
//    return new ArrayList<>(set);
//}
//}

//    .Napisz generyczną statyczną metodę printMarginal, której argumentem jest dowolny obiekt
//    implementujący interfejs Iterable<E>

//
//    public class ArrayUtil {
//        public static <E> void printMarginal(Iterable<E> iterable) {
//            Iterator<E> iterator = iterable.iterator();
//            if (iterator.hasNext()) {
//                System.out.print(iterator.next());
//            }
//            while (iterator.hasNext()) {
//                iterator.next();
//            }
//            if (iterator.hasPrevious()) {
//                System.out.print(", " + iterator.previous());
//            }
//            System.out.println();
//        }
//}

//    Napisz statyczną generyczną metodę ArrayUtil.jestpalindromem, która sprawdza czy podana jaka
//    argument tablica obiektów klasy T ma tę własnośc , że wypisanie tej tablicy od początku do końca
//    daje taki sam wynik jak jej wypisanie od końca do początku . W definicji metody zadeklaruj ze klasa T
//    musi implemtować generyczny interfejs Comparable

//    public class ArrayUtil {
//        public static <T extends Comparable<T>> boolean jestPalindromem(T[] a){
//            for (int i = 0; i < a.length - 1; i ++) {
//                if (a[i].compareTo(a[a.length - 1 - i]) < 0) {
//                    return false;
//                }
//            }
//            return true;






//    public static <E> void wypiszCoDrugi(Iterable<E> t){
//        Iterator<E> iterator = t.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next());
//            if(iterator.hasNext())
//                iterator.next();
//            if(iterator.hasNext())
//                System.out.print(",");
//        }
//        System.out.println();

