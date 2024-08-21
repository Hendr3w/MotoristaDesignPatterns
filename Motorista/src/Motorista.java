public class Motorista {
    public Direcao d;

    public void pisarAcelerador(Double valor){
        this.d.acelerar(valor);
    }

    public void pisarFreio(Double valor){
        this.d.frear(valor);
    }

    public void ligarChave(){
        this.d.ligar();
    }

    public void desligarChave(){
        this.d.desligar();
    }

    public void olharVelocimetro(){
        this.d.velocimetro();
    }


}
