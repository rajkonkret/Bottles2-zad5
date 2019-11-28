public class Main {
    //    Gromadzimy wodę mineralną. Są trzy rodzaje butelek:
//    a.o pojemności 2 l (duże) ,
//    b.średnie –opojemności 1
//    c.małe o pojemności 0.5 l.
//    Stworzyć klasę MyWater z metodami:
//    a.void addLarge(int)-dodaje do zapasu wody podaną jako argument liczbę dużychbutelek,
//    b.void addMedium(int)-dodaje do zapasu wody podaną jako argument liczbę średnichbutelek,
//    c.void addSmall(int)-dodaje do zapasu wody podaną jako argument liczbę małych butelek
//    d.oraz z metodami umożliwiającymi uzyskanie informacji o tym ile jest każdego rodzajubutelek
//    oraz jaka jest łączną pojemność zgromadzonej wody.
//        Pojemności butelek (dużych, średnich, małych) przedstawić jako pola statyczne klasy.
//    Dostarczyć metody, pozwalające na uzyskanieinformacji o tych pojemnościcach
//    oraz na ich zmianę.Klasę przetestować dodając do zapasu różne liczby butelek wody i wyprowadzając komunikat w rodzaju:
//    Mam teraz 6.5 litrów wodydużych butelek: 2
//    średnich butelek: 1
//    małych butelek: 3
    public static void main(String[] args) {
        MyWater wmywater = new MyWater();
        wmywater.addLarge(10);
        MyWater.setLargeCapacity(5);
        wmywater.addLarge(10);
        System.out.println(MyWater.getLargeCapacity()*wmywater.getLargeCounter());

    }
}
