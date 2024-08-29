import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                                        new Date(), "111.111.111-11", 36, 'm');
        Cliente lojinha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000",
                                        new Date(), "000.00000.0000/0001", 25, "Comércio");
        
        //contas
        Conta conta1 = new ContaPoupanca(1234, joao, 100,800);
       
    
        try
        {
        conta1.depositar(10);
        
        } catch(ValorNegativoException h)
        {
            
        }
        try{
        try{
            conta1.sacar(4000);
        }
        catch(SemLimiteException g)
        {
            System.out.println("Erro");
        }
        }catch(ValorNegativoException u)
        {
            System.out.println("Erro ");
        }
       
      
        //implementacao do equals
        //retorna true devido ao fato do numero ser igual e é verificado no metodo equals
       //Nova forma de imprimir 
        System.out.println("--------------------");
        System.out.println(conta1.toString());
        System.out.println("--------------------");
       
        System.out.println("--------------------");
        //Forma antiga com modificacoes internas
        conta1.impressao_extratosMAIN();
        //teste da implementacao dos novos metodos 
        System.out.println("Informacoes dos usuarios : ");
        System.out.println("-------------------");
        System.out.println(lojinha.toString());
        System.out.println("-------------------");
        System.out.println(joao.toString());
        System.out.println("-------------------");
        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);

        System.out.println(conta1.getDono().getClass()==PessoaJuridica.class);



    }
}