public class ValorNegativoException extends Exception 
{
    public  ValorNegativoException()
    {
        super("Valor negativo nao eh permitido");
    }
    public ValorNegativoException(String message)
    {
        super(message);
    }
}
