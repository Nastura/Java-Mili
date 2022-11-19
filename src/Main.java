public class Main {
    public static void main(String[] args) {

        // price - Сумма оплаченная за билет клиентом.
        // fixed - фиксированное число, 20 рублей
        // mili - количество миль начисленных клиенту
        // Если в результате деления 1 цифра после точки больше 5, то округляем в большую сторону, если меньше, то в меньшую.

        double price = 2490;
        int fixed = 20;
        double mili;

        if (price >= 20) {
            mili = (price / fixed);
        } else {
            mili = 0;
        }
        System.out.println("Вам начислилось: " + (int)Math.round(mili) + "миль");
        System.out.println("Спасибо за покупку!");

    }
}