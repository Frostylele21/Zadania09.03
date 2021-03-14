public class Zadanie1
{
    public static void main(String[] args)
    {
        Kwadrat kwadrat = new Kwadrat(15);

        Trojkat trojkat = new Trojkat(5, 8, 13, 4.5);

        Prostokat prostokat = new Prostokat(5, 6);

        kwadrat.obliczObwod();
        kwadrat.obliczPole();

        System.out.println();

        trojkat.obliczObwod();
        trojkat.obliczPole();

        System.out.println();

        prostokat.obliczObwod();
        prostokat.obliczPole();
    }
}
