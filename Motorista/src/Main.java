public class Main {
    public static void main(String[] args) {

        Motorista motorista = new Motorista();
        Carro carro = new Carro();
        Moto moto = new Moto();

        motorista.d = carro;

        motorista.d.tipoVeiculo();
        motorista.ligarChave();
        motorista.pisarAcelerador(100.0);

        motorista.olharVelocimetro();

        motorista.pisarFreio(25.0);
        motorista.olharVelocimetro();

        motorista.d = moto;

        motorista.d.tipoVeiculo();
        motorista.ligarChave();
        motorista.pisarAcelerador(200.0);

        motorista.olharVelocimetro();

        motorista.pisarFreio(25.0);
        motorista.olharVelocimetro();




    }
}