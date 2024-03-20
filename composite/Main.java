package composite;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando a estrutura do diretório
        Directory root = new Directory("Root");
        Directory dir1 = new Directory("Dir1");
        Directory dir2 = new Directory("Dir2");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        root.add(dir1);
        root.add(dir2);
        root.add(file1);
        dir1.add(file2);

        // Imprimindo a estrutura do diretório
        root.print("");
    }
}
