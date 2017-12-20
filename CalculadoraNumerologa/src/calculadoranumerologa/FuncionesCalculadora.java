/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoranumerologa;

/**
 *
 * @author Nelson
 */
public class FuncionesCalculadora {
    public void recepcionNombre(String nombre, int modo){
        int total=0, totvocales=0, totconsonantes=0;
        String aux="";
        if(modo==1){//1 para caldeo
            for(int i=0;i<nombre.length();i++){
                aux=Character.toString(nombre.charAt(i));
                total=total+metodoCaldeo(aux);
                if(aux.equalsIgnoreCase("a")||aux.equalsIgnoreCase("e")||aux.equalsIgnoreCase("i")||aux.equalsIgnoreCase("o")||aux.equalsIgnoreCase("u")) totvocales=totvocales+metodoCaldeo(aux);
                else totconsonantes=totconsonantes+metodoCaldeo(aux);;
                
            }
            System.out.println(nombre+" Caldeo "+total+" "+totvocales+" "+totconsonantes+" "+metodoSuma(total)+" "+metodoSuma(metodoSuma(total)));
        }
        if(modo==2){//1 para pitagoras
            for(int i=0;i<nombre.length();i++){
                aux=Character.toString(nombre.charAt(i));
                total=total+metodoPitagorico(aux);
                if(aux.equalsIgnoreCase("a")||aux.equalsIgnoreCase("e")||aux.equalsIgnoreCase("i")||aux.equalsIgnoreCase("o")||aux.equalsIgnoreCase("u")) totvocales=totvocales+metodoPitagorico(aux);
                else totconsonantes=totconsonantes+metodoPitagorico(aux);;
                
            }
            System.out.println(nombre+" Pitagoras "+total+" "+totvocales+" "+totconsonantes+" "+metodoSuma(total)+" "+metodoSuma(metodoSuma(total)));
        }
    }
    public int metodoCaldeo(String caracter){
        int valor=0,i,j;
        String [][] v={ {"a","i","j","q","y"},//valor 1 5 caracteres
                        {"b","k","r"},
                        {"c","g","l","s"},
                        {"d","m","t"},
                        {"e","h","n","x","ñ"},
                        {"u","v","w"},
                        {"o","z"},
                        {"f","p"}
                       };
        for(i=0;i<v.length;i++){
            for(j=0;j<v[i].length;j++){
                if(caracter.equalsIgnoreCase(v[i][j])){
                    return valor=i+1;
                }
            }
        }        
        return valor=0;//esto significa que es un caracter extraño
    }
    
    public int metodoPitagorico(String caracter){
        int valor=0,i,j;
        String [][] v={ {"a","j","s"},
                        {"b","k","t"},
                        {"c","l","u"},
                        {"d","m","v"},
                        {"e","n","w","ñ"},
                        {"f","o","x"},
                        {"g","p","y"},
                        {"h","q","z"},
                        {"i","r"},
                       };
        for(i=0;i<v.length;i++){
            for(j=0;j<v[i].length;j++){
                if(caracter.equalsIgnoreCase(v[i][j])){
                    return valor=i+1;
                }
            }
        }        
        return valor=0;//esto significa que es un caracter extraño
    }
    
    public int metodoSuma(int variable){
        int valor=0,i,j,k,l;
		if (variable<100){
			i=variable%10;
			j=variable/10;
                        
			return valor=i+j;
		}
		else{
			j=variable%10;
			i=variable/10;
			k=i%10;
			l=i/10;
			return valor=j+k+l;//esto significa que es un caracter extraño
		}
		
    }
    
}
