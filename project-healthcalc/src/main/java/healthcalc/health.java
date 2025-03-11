package healthcalc;

/**
 * 
 * author Marcos Llopis Ontañón
 */


public  class health implements HealthCalc {
    @Override
    public float idealWeight(int height, char gender) throws Exception{
        float IW=0;
        Character genero=Character.toUpperCase(gender);
        if (genero != 'W' && genero != 'M') {
            throw new IllegalArgumentException("No es ni hombre ni mujer");
        }
        else if(height>230 || height<90){
            throw new IllegalArgumentException("valores fuera de rango");
        }
        else{
            if(genero=='M'){
                IW = height - 100 - (height - 150) / 4f;
            }
            else{
                IW=height - 100 - (height - 150) / 2.5f;
            }
        }
    return IW;
    }
  
    @Override
	public float basalMetabolicRate(float weight, int height, int age, char  gender) throws Exception {
        
        Character genero = Character.toUpperCase(gender);
        if (20 > weight || weight > 300) {
            throw new IllegalArgumentException("valor fuera del rango");
                }
        else if(height>230 || height<90){
            throw new IllegalArgumentException("valor fuera de rango");
        }
        else if (genero != 'W' && genero != 'M') {
                throw new IllegalArgumentException("valor fuera de rango");
            }
        else if (0 > age || age > 100) {
                throw new IllegalArgumentException("valor fuera de rango");
            }
        
        else{
            if(genero=='M'){
                float BMR = 10 * weight + 6.25f * height - 5 * age + 5;
                    if(BMR>0){
                        return BMR;
                    }else{
                        throw new IllegalArgumentException("valores no adecuados");
                    }
            }
            else{
                float BMR = 10 * weight + 6.25f * height - 5 * age - 161;
                    if(BMR>0){
                        return BMR;
                }else{
                    throw new IllegalArgumentException("valores no adecuados");
                }
                }
            }
        }

}
