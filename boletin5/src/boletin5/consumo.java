//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD
package boletin5;
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD

public class consumo {
    private float kilometros;
    private float litros;
    private float vMed;
    private float pGas;
    private float km;

// constructor por defecto
public consumo () {

    }
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD

//constructor parametrizado
    public consumo (float km, float li, float vM, float pG) {
           kilometros = km;
           litros =  li;
           vMed = vM;
           pGas = pG;
    }            
// metodos de acceso
    public float getTempo ( ) {
        return vMed*kilometros ;
        
    }
     public float consumoMedio ( ){
        return litros/kilometros*100 ;
        
    }      
    public float consumoEuros ( ){
        return litros*pGas/kilometros;
        
    }
    public void setKms ( float km){
        
    }
    public void setLitros ( float li){
        
        
    }
    public void setvMed (float vMed ){
        
        
    }
    public void setPGas (float pGas ){
        
    }
    
    public float getKms() {
    return this.km;
    }
    public float getLitros() {
        return this.litros;
    }
    public float getvMed() {
        return this.vMed;
    }
    public float getpGas() {
        return this.pGas;
    }
}

//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD
//ESTO ES UNA MODIFICACION PARA EL EXAMEN DE COD