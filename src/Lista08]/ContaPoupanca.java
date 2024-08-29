public class ContaPoupanca extends Conta  {
   
    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo);
        setLimite(limite);
    }

    public void setLimite(double limit) throws IllegalArgumentException
    {
        
        if(limit <= 1000 && limit >=100)
        {
            this.limite = limit;
        }else {throw new IllegalArgumentException();}
        
    }
    public double getLimite() {
        return limite;
    }
   
    public double calculataxas() {
      double  taxa_cobrada = 0;
      return taxa_cobrada;
    }
}
