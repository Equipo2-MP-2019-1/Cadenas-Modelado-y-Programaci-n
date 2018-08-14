
package modelado.cadenas;

public class Cadena {

    public String concatenacion(String s1, String s2){
        return "";
    }

    public String reversa(String s){
        





		return "";
    }

    public boolean palindromo(String s){
      
		return true;
    }

    public String repetidos(String s, char c){
		int primer = s.indexOf(c);
		int ultimo = s.lasIndexOf(c);
		String res = substring(primer+1,ultimo);
		s.replace(res);		
		return s;
    }

    public String quitaEspacios(String s){
        return "";
    }
}
