
package entidades;

public abstract class veiculo
{
    protected String marca;
    protected String modelo;
    
    public veiculo (String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    
    }
       
    public abstract String dirigir();
    public abstract String exibirdetalhes();
}



