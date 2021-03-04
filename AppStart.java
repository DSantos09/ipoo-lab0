
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart
{
    public static void main(String args[]) {
        int ordem = 1;
        String name = "MEDIUM";
        Size Medium = Size.MEDIUM;
        System.out.println("Name:" + name);
        System.out.println("toString():" + Medium.toString());
        System.out.println("Ordem:" + ordem);
        System.out.println("Valor minimo:" + Medium.getMinValue());
        System.out.println("Valor maximo:" + Medium.getMaxValue());
        System.out.println("Código:" + Medium.getCode());
    }
    
}

