package composite;

// File.java
public class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "File: " + name);
    }
}
