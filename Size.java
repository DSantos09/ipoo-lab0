
/**
 * Enumeration class Size - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Size {
    SMALL(32, 36, "Pequeno", 'S'),
    MEDIUM(37, 44, "Médio", 'M'),
    LARGE(45, 52, "Grande", 'L');
  
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }
    
    @Override
    //retorna a descrição
    public String toString() {
        return this.description;
    }
    
    public String getDescription() {
        return description;
    }
    
    //retorna o valor mínimo
    public int getMinValue() {
        return minValue;
    }
    
    //retorna o valor máximo
    public int getMaxValue() {
        return maxValue;
    }
    
    //retorna o código
    public char getCode() {
        return code;
    }
    
}
    
    