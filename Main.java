import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a1, a2, a3, b;
        b = 0;
        System.out.println("вы хотите начать проверку первой части?");
        System.out.println("1-да 2-перейти ко второй части");
        a2 = S.nextInt();
        Double[] a = new Double[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 200 - 100);
        }
        while (a2 == 1) {
            System.out.println("выберите задание от 1 до 5");
            a1 = S.nextInt();
            if (a1 == 1) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + 1 + " число " + a[i]);
                }
            }
            if (a1 == 2) {
                for (int i = 9; i > -1; i--) {
                    System.out.println(i + 1 + " число " + a[i]);
                }
            }
            if (a1 == 3) {
                for (int i = 1; i < 10; i = i + 2) {
                    System.out.println((i+1) + " число " + a[i]);
                }
            }
            if (a1 == 4) {
                System.out.println("с какого элемента выводить через 1?");
                a3 = S.nextInt();
                for (int i = a3 - 1; i < 10; i = i + 2) {
                    System.out.println(i + 1 + " число " + a[i]);
                }
            }
            if (a1 == 5) {
                while (b != 10 && a[b] != -1) {
                    System.out.println(b + 1 + " число " + a[b]);
                    b = b + 1;
                }
            }
            if(a1>5 || a1<1) {
                System.out.println("нет такоко номера в первой части");
            }
            System.out.println("вы хотите продолжить проверку первой части?");
            System.out.println("1-да 2-перейти ко второй части");
            a2 = S.nextInt();
        }
        a1=1;
        int d1, d2;
        System.out.println("сколько ячеек вы хотите иметь в массиве?");
        int d = S.nextInt();
        double[] c = new double[d];
        double[] sub = new double[d];
        for (int i=0; i<d;i++) {
            c[i] = 0;
            sub[i] = Math.random() * (1000)+0;
        }
        while (a1 == 1) {
            System.out.println("какое вы хотите проверить задание второй части?(1-7)");
            d1 = S.nextInt();
            if (d1 == 1) {
                System.out.println("какое значение вы хотите добавить в конец массива?");
                d2 = d - 1;
                c[d2] = S.nextDouble();
                System.out.println("теперь значение ячейки "+ d + " равно " + c[d2]);
            }
            if (d1==2){
                System.out.println("какое значение вы хотите добавить в начало массива?");
                c[0]=S.nextDouble();
                System.out.println("теперь значение ячейки "+ 1 + " равно " + c[0]);
            }
            if (d1==3){
                System.out.println("в какую ячейку массива вы хотите добавить значение 1-" + d);
                d2=S.nextInt() - 1;
                System.out.println("какое значение вы хотите добавить в эту ячейку?");
                c[d2]=S.nextDouble();
                System.out.println("теперь значение ячейки "+ (d2+1) + " равно " + c[d2]);
            }
            if (d1==4){
                d2=d-1;
                c[d2]=0;
                System.out.println("теперь значение последней ячейки равно " + c[d2]);
            }
            if (d1==5){
                c[0]=0;
                System.out.println("теперь значение первой ячейки равно " + c[0]);
            }
            if (d1==6){
                System.out.println("какую ячейку вы хотите обнулить?");
                d2=S.nextInt()-1;
                c[d2]=0;
                System.out.println("теперь значение ячейки " + (d2+1) + " равно " + c[d2]);
            }
            if(d1==7){
                System.out.println("ваш созданный массив");
                for (int i=0; i<d;i++){
                    System.out.println(i+1+ " ячейка: " +c[i]);
                }
                System.out.println("вспомогательный массив созданный автономно");
                for (int i=0; i<d;i++){
                    System.out.println(i+1+" ячейка: "+sub[i]);
                }
                for (int i=0; i<d;i++){
                    if (c[i]==0){
                        c[i]=sub[i];
                    }
                }
                System.out.println("итоговый массив");
                for (int i=0; i<d;i++){
                    System.out.println(i+1+ " ячейка: " +c[i]);
                }
            }
            System.out.println("хотите продолжить со второй частью?");
            System.out.println("1-да 2-нет");
            a1=S.nextInt();
        }
        System.out.println("алибидерчи");
    }
}