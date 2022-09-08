package Heranca.DesafioHeranca;

public class Ferrari extends Carro implements Esportivo, Luxo{
    
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    Ferrari(Double velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15.0);
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public Double getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35.0;
        } else if(ligarTurbo && ligarAr){
            return 30.0;
        } else if(ligarTurbo && !ligarAr){
            return 20.0;
        } else {
            return 15.0;
        }
    }

}
