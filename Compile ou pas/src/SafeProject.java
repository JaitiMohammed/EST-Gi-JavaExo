import java.util.Scanner;
import java.util.ArrayList;


//inteégrité de données
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

    
    private int readInt(Scanner scanner) throws WrongDurationException, NumberFormatException {
        String strNumber = scanner.nextLine();
        int number;
        number = Integer.parseInt(strNumber);
        if (number <= 0) {
            throw new WrongDurationException("La durée soit positif !");
        }
        return number;
    }

   
    private String readString(Scanner scanner) throws NameTooLongException {
        String str = scanner.nextLine();
        if (str.length() > 50) {
            throw new NameTooLongException("la valuer éxcède les 50 caracètre");
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
                System.out.println("Donnez la durée du projet : ");
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