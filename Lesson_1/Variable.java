public class Variable {
    public static void main(String[] args) {
        // количество ядер процессора
        byte proCores = 12;
        //    максимальная частота процессора  
        short maxFreqCpu = 3300;
        //  оперативаная память  в гигабайтах
        int ram =32;        
        //  объе жесткого диска в гигабайтах
        long rom = 512;
        // использованно  гигабайт на жестком диске 
        float useRom = 21.42f;
        // использованно гигабайт оперативной памяти
        double useRam = 3.04d;
        // знак Java
        char cupJava ='\u2615';
        // знак сердечко
        char heart = '\u2665';
        //Изучаю ли я Java ?
        boolean javaLearn = true;
        System.out.println("Количество ядер моего процессора = " + proCores);
        System.out.println("Максимальная частота моего процессора в MHz = " + maxFreqCpu);
        System.out.println("Количество оперативной памяти моего пк в гигабайтах = " + ram);
        System.out.println("Объем жесткого диска моего пк в гигабайтах = " + rom);
        System.out.println("использованно гигабайт на жестком диске = " + useRom);
        System.out.println("использованно гигабайт оперативной памяти = " + useRam);
        System.out.println("Мне нравится изучать  Java " + cupJava + " " + heart);
        System.out.println("Я изучаю Java = " + javaLearn);
    }
}