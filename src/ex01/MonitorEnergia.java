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

        return media(1,indice);
    }

    public double media(int inicio, int fim){
        double media=0;

        for (int i=inicio-1;i<fim;i++){
            media += consumo[i];
        }

        return media/(fim-inicio+1);
    }
}
