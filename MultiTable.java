public class MultiTable {
    public static void main(String[] args){
        int n = 5;
        printMultiTable(n);
    }

    public static void printMultiTable(int n){
        // Выводим заголовок таблицы
        System.out.print("  ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print("\n");

        // Выводим таблицу умножения
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
