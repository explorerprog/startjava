public class Variable {
    public static void main(String[] args) {
        byte cpuCores = 12;
        short maxFreqCpu = 3300;
        int ramGb =32;
        long romGb = 512;
        float useRomGb = 21.42f;
        double useRamGb = 3.04d;
        char signCupJava ='\u2615';
        char signHeart = '\u2665';
        // Изучаю ли я Java ?
        boolean learnerJava = true;

        System.out.println("Количество ядер моего процессора = " + cpuCores);
        System.out.println("Максимальная частота моего процессора в MHz = " + maxFreqCpu);
        System.out.println("Количество оперативной памяти моего пк в гигабайтах = " + ramGb);
        System.out.println("Объем жесткого диска моего пк в гигабайтах = " + romGb);
        System.out.println("использованно гигабайт на жестком диске = " + useRomGb);
        System.out.println("использованно гигабайт оперативной памяти = " + useRamGb);
        System.out.println("Мне нравится изучать  Java " + signCupJava + " " + signHeart);
        System.out.println("Я изучаю Java = " + learnerJava);
    }
}