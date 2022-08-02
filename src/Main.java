public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte age = 27;
        short height = 178;
        int weight = 94;
        long money = 1300L;
        float brotherHeight = 182.3f;
        double brotherWeight = 86.400;
        char svo = 'Z';
        boolean normalHeight = height > 162;

        //Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double totalWeight = boxer1 + boxer2;
        double differenceWeight = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг");

        //Задание 3

        int bananas = 5;
        int milk = 200;
        int plombir = 2;
        int eggs = 4;
        bananas = 5 * 80;
        milk = 200 / 100 * 105;
        plombir = 2 * 100;
        eggs = 4 * 70;

        double sportBreakfast = bananas + milk + plombir + eggs;
        System.out.println("Количество грамм завтрака " + sportBreakfast);
        double kilogramm = sportBreakfast / 1000;
        System.out.println("Переведенное в КГ " + kilogramm);

        // Задание 4
        int weight1 = 7;
        weight1 = 7 * 1000;
        int diet1 = weight1 / 250;
        int diet2 = weight1 / 500;
        int averageDays = (diet1 + diet2) / 2;
        System.out.println("Если спортсмен будет терять в день 250 гр " + diet1);
        System.out.println("Если спортсмен будет терять в день 500 гр " + diet2);
        System.out.println("Среднее количетсво дней " + averageDays);

        // Задание 5
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;

        int mashaPribavka = masha / 10;
        int denisPribavka = denis / 10;
        int krisPribavka = kris / 10;

        int mashaNew = masha + mashaPribavka;
        int denisNew = denis + denisPribavka;
        int krisNew = kris + krisPribavka;

        int mashaDoPovishenia = masha * 12;
        int denisDoPovishenia = denis * 12;
        int krisDoPovishenia = kris * 12;

        int mashaPoslePov = mashaNew * 12;
        int denisPoslePov = denisNew * 12;
        int krisPoslePov = krisNew * 12;

        System.out.println("Маша теперь получает " + mashaNew + " годовой доход вырос с " + mashaDoPovishenia + " до " + mashaPoslePov );
        System.out.println("Денис теперь получает " + denisNew + " годовой доход вырос с " + denisDoPovishenia + " до " + denisPoslePov );
        System.out.println("Крис теперь получает " + krisNew + " годовой доход вырос с " + krisDoPovishenia + " до " + krisPoslePov );
    }
}