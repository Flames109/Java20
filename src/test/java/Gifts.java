/**
 * Разработано 09.09.2018
 * Формирование новогоднего подарка
 * @author Flames109
 * @version
 */

public class Gifts {

    public static class Chocolate {
        static String name = "Alpen Gold";
        static int weight = 120;
        static double price = 41.2;
        static String manufacturer = "Alpen";

    }

    public static class Marmalade {
        static String name = "Frutella Meeks";
        static int weight = 25;
        static  int price = 55;
        static String manufacturer = "Frutella";
    }

    public static class Cookie {
        static String name = "Юбилейное";
        static int weight = 85;
        static int price = 50;
        static String manufacturer = "Печенье Юбилейное";
    }

    public static class Waffel {
        static String name = "Бельгийские вафли";
        static int weight = 158;
        static int price = 102;
        static String manufacturer = "Бельгийские";
    }

    public static void main(String[] args) {
        String GiftName  = "5 "+Chocolate.name + ", 3 драже " + Marmalade.name + ", 4 шоколадки "+Chocolate.name+", 6 упаковки леденцов " + Waffel.name;
        System.out.println("Подарок состоит из:\n" + GiftName +'\n');
        int GiftWeight = 5*Chocolate.weight + 3*Marmalade.weight + 4*Chocolate.weight + 6*Waffel.weight;
        System.out.println("Общий вес подарка в граммах:\n" + GiftWeight+'\n');
        double GiftPrice = 5*Chocolate.price + 3*Marmalade.weight + 4*Chocolate.weight + 6*Waffel.weight;
        System.out.printf("Общая цена подарка в рублях:\n %.2f\n", GiftPrice);
        String GiftMan  = Chocolate.manufacturer + ", " + Marmalade.manufacturer + ", "+Chocolate.manufacturer+", " + Waffel.manufacturer;
        System.out.println("В составе подарка продукция следующих производителей:\n" + GiftMan +'\n');
    }
}
