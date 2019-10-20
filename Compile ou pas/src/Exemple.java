
// NB: Ce code n'est pas compilable 
class Exemple {
    
    /*Expliquer pourquoi ce code ne compile pas
    SOLUTION : Il faut entourer l'appel de la méthode foo() par un bloc try/catch
    */
   public void m1() {
        foo();
    }
    
    public int foo() throws Exception {
        throw new Exception();
    }
    
    /*Expliquer pourquoi ce code n'est pas considéré comme bon
    SOLUTION : Le premier bloc interceptes les exception de type "Exception",
    donc il intercepte toutes les exceptions possibles. Mais si le code situé
    à l'intérieur du bloc try lève des exceptions précises (NullPointerException,
    IllegalArgumentException, etc...) on perd l'information sur le type d'exception
    qui a été levée.
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
    de type "NullPointerException". Le deuxième bloc n'est donc jamais atteint.
    */
    public void m3() {
        try {
            //do stuff...
        } catch (Exception e) {
            
        } catch (NullPointerException e) {
            
        }
    }
    
    /*Expliquer pourquoi ce code ne compile pas
    SOLUTION : Il manque "throws CustomCheckedException" à la signature
    de la méthode.
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
    SOLUTION : La variable "age" n'est pas initialisée. Si le déroulement
    de la méthode "getAccessCode()" ne lance pas d'exception, ce n'est pas un
    problème. Mais dans le cas contraire, la variable "age" ne se verra affecter
    aucune valeur. Il faut donc lui donner une valeur "par défaut".
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
    SOLUTION : Toutes les exceptions héritant du type RuntimeException ne doivent pas obligatoirement
    être traitées (unchecked exceptions), le compilateur ne signalera ainsi aucune erreur,
    même si l'on n'utilise pas de bloc try-catch. Il n'est pas non plus demandé d'ajouter l'instruction
    "throws RuntimeException" dans la signature de la méthode;
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