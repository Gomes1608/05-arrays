package ex01;

public class MonitorEnergia {
    double[] consumo;
    int indice;

    public MonitorEnergia(int tamanho) {
        this.consumo = new double[tamanho];

    }

    public void registrar(double valor){
        if (indice < consumo.length){
            consumo[indice] = valor;
            indice++;
        }
    }

    public double media(){
        double media=0;

        for (int i=0;i<indice;i++){
            media += consumo[i];
        }

        return media/indice;
    }

    public double media(int inicio, int fim){
        double media=0;

        for (int i=inicio-1;i<fim;i++){
            media += consumo[i];
        }

        return media/(fim-inicio+1);
    }
}
