import java.util.Scanner;
import java.util.ArrayList;


//inte�grit� de donn�es
class SafeProject {
    
    private final static int NB_PROJECTS = 3;
    
    public static void main(String[] args) {
        ArrayList<Project> projects = new ArrayList<Project>();
        
        do {
            Project project = new Project();
            project.readProject();
            projects.add(project);
        } while (projects.size() < NB_PROJECTS);
    }
}

class Project {
    private String name = null;
    private String subject = null;
    private int duration = -1;

    public Project() {}
     //Scanner scanner=new Scanner(System.in);
     private int readInt(Scanner scanner) throws WrongDurationException {
        String strNumber = scanner.nextLine();
        int number;
        try {
            number = Integer.parseInt(strNumber); 
        } catch (NumberFormatException e) {
            throw new WrongDurationException(strNumber + " Ce n'est pas un nombre !");
        }
        if (number <= 0) {
            throw new WrongDurationException("la dur�e soit positif !");
        }
        return number;
    }

    private String readString(Scanner scanner) throws NameTooLongException {
        String str = scanner.nextLine();
        if (str.length() > 50) {
            throw new NameTooLongException(" valeur n'exc�de pas les 50 caract�res");
        }
        return str;
    }

    public void readProject() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Donnez le nom du projet : ");
            try {
                name = readString(scanner);
            } catch (NameTooLongException e) {
                System.err.println("[ " + e.getMessage() + " ]");
            }
        } while (name == null);

        do {
            try {
                System.out.println("Donnez le sujet du projet : ");
                this.subject = readString(scanner);
            } catch (NameTooLongException e) {
                System.err.println("[ " + e.getMessage() + " ]");
            }
        } while (subject == null);

        do {
            try {
                System.out.println("Donnez la dur�e du projet : ");
                this.duration = readInt(scanner);
            } catch (WrongDurationException e) {
                System.err.println("[ " + e.getMessage() + " ]");
            }
        } while (duration < 0);
    }
}

class WrongDurationException extends Exception {
    public WrongDurationException(String msg) {
        super(msg);
    }

    public WrongDurationException() {
        super("Wrong duration !");
    }
}


class NameTooLongException extends Exception {
    
    public NameTooLongException(String s) {
        super(s);
    }
    
    public NameTooLongException() {
        super("Too long name !");
    }

}