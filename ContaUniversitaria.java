public class ContaUniversitaria extends Conta{

    
  
    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo);
        setLimite(limite);
       
    }

    public void setLimite(double limite) throws IllegalArgumentException {
        if(limite <= 500 && limite >= 0)
        {
            this.limite = limite;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    public double getLimite() {
        return limite;
    }
    @Override
    public double calculataxas() {
        double  taxa_cobrada = 0;
        return taxa_cobrada;
    }
}
