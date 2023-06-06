public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //причина возникновения ошибки - деление на ноль.
        //при условии, что делитель не ноль - выполняем операцию, иначе возвращаем ноль (не лучший вариант, можно ещё выкинуть исключение)
        calc.println.accept(c);
    }
}