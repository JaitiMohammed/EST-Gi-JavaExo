
// NB: Ce code n'est pas compilable 
class Exemple {
    
    /*Expliquer pourquoi ce code ne compile pas
    SOLUTION : Il faut entourer l'appel de la m�thode foo() par un bloc try/catch
    */
   public void m1() {
        foo();
    }
    
    public int foo() throws Exception {
        throw new Exception();
    }
    
    /*Expliquer pourquoi ce code n'est pas consid�r� comme bon
    SOLUTION : Le premier bloc interceptes les exception de type "Exception",
    donc il intercepte toutes les exceptions possibles. Mais si le code situ�
    � l'int�rieur du bloc try l�ve des exceptions pr�cises (NullPointerException,
    IllegalArgumentException, etc...) on perd l'information sur le type d'exception
    qui a �t� lev�e.
    */
    public void m2() {
        try {
            //do stuff...
        } catch (Exception e) {
            
        }
    }
    
    /*Expliquer pourquoi ce code ne compile pas
    SOLUTION : Le premier bloc interceptes les exception de type "Exception",
    donc il intercepte toutes les exceptions possibles, y-compris une exception
    de type "NullPointerException". Le deuxi�me bloc n'est donc jamais atteint.
    */
    public void m3() {
        try {
            //do stuff...
        } catch (Exception e) {
            
        } catch (NullPointerException e) {
            
        }
    }
    
    /*Expliquer pourquoi ce code ne compile pas
    SOLUTION : Il manque "throws CustomCheckedException" � la signature
    de la m�thode.
    */
    public void m4() {
        throw new CustomCheckedException();
    }
    
    private class CustomCheckedException extends Exception {
        
        private static final long serialVersionUID = -7944813576443065516L;

        public CustomCheckedException() {
            //nothing
        }
        
    }
    
    /*Expliquer pourquoi ce code ne compile pas
    SOLUTION : La variable "age" n'est pas initialis�e. Si le d�roulement
    de la m�thode "getAccessCode()" ne lance pas d'exception, ce n'est pas un
    probl�me. Mais dans le cas contraire, la variable "age" ne se verra affecter
    aucune valeur. Il faut donc lui donner une valeur "par d�faut".
    */
    public int m5() {
        int age;
        String s = "24";
        try {
            age = getAccessCode();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return age;
    }
    
    public int getAccessCode() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
    
    /*Expliquer pourquoi ce code COMPILE
    SOLUTION : Toutes les exceptions h�ritant du type RuntimeException ne doivent pas obligatoirement
    �tre trait�es (unchecked exceptions), le compilateur ne signalera ainsi aucune erreur,
    m�me si l'on n'utilise pas de bloc try-catch. Il n'est pas non plus demand� d'ajouter l'instruction
    "throws RuntimeException" dans la signature de la m�thode;
    Exemple de "unchecked exceptions" : 
    NullPointerException, NumberFormatException, IllegalArgumentException, etc...
    */
    public void m6() {
        bar();
    }
    
    public int bar() {
        throw new RuntimeException();
    }
    

}