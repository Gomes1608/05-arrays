package ex01;

public class Main {
    public static void main(String[] args) {
        MonitorEnergia monitor = new MonitorEnergia(100);
        monitor.registrar(1);
        monitor.registrar(3);
        monitor.registrar(2);
        monitor.registrar(3);
        monitor.registrar(2);

        System.out.println("Média de consumo até o momento: "+monitor.media());
        System.out.printf("Média em um ontervalo de dias: "+monitor.media(2, 4));

    }
}
