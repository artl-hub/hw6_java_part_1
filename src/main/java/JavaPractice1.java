public class JavaPractice1 {

    public static void main(String[] args) {


        int a = 12;
        int b = 6;
        int c = 5;

        System.out.println("========= Арифметические операторы =========");

        System.out.println("================ Сложение ==================");
        System.out.println(a + " + " + b + " = " + (b + a));
        System.out.println("================ Вычитание ==================");
        System.out.println(a + " - " + b + " = " + (b - a));
        System.out.println("================ Умножение ==================");
        System.out.println(b + " * " + a + " = " + (b * a));
        System.out.println("================= Деление ===================");
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println("========= Деление по модулю ==================");
        System.out.println(a + " % " + c + " = " + (a % c));
        System.out.println("c % a = " + (a % a));
        System.out.println("============= Логические операторы ===========");
        System.out.println("====================  if, <> =================");
        if (a > b) {
            System.out.println("a > b       " + a + " > " + b);
        } else {
            System.out.println("a < b       " + a + " < " + b);
        }
        System.out.println("============ Тернарный оператор ================");
        String message = a % 2 == 0 ? "четное" : "нечетное";
        System.out.println("Число " + a + " " + message);
        System.out.println("============ Оператор && ================");
        boolean сondition1 = a > b && a > c;
        System.out.println(сondition1);

        System.out.println("============ Оператор || ================");
        boolean сondition2 = a > b || b > c;
        System.out.println(сondition2);
        System.out.println("============ Переполнение bite=============");
        byte d = 127;
        byte e = 9;
        byte f = (byte) (d + e);
        System.out.println("d + e = " + f);
        System.out.println("====== действия с int и double ============");
        double g = 3.3;
        int h = 3;
        int sumGh = (int) (h + g);
        System.out.println("h + g = " + sumGh);


    }

}
