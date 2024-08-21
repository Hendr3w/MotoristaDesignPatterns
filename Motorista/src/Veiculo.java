public abstract class Veiculo implements Direcao {
    public boolean ligado = false;
    public Double velocidade = 0.0;
    @Override
    public abstract void tipoVeiculo();
    @Override
    public void acelerar(Double aceleracao){
        if (!this.ligado) {
            System.out.println("Inválido, Veiculo Desligado");
            return;
        }

        this.velocidade += aceleracao;

    }
    @Override
    public void frear(Double valor){
        this.velocidade = (this.velocidade - ((valor / 100) * this.velocidade));
    }
    @Override
    public void ligar(){
        this.ligado = true;
    }
    @Override
    public void desligar(){
        this.ligado = false;
    }

    @Override
    public void velocimetro(){
        System.out.println("Velocidade: " + this.velocidade);
    }
}
