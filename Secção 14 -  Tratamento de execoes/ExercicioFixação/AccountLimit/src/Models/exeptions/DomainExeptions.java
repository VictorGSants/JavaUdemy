package Models.exeptions;

public class DomainExeptions extends Exception{
    private static final long serialVersionUID = 1L; // declara a versão de uma classe serialiser

    public DomainExeptions(String msg){
        super(msg); // permite que se passe uma mensagem pela exeção personalizada
    }
}
