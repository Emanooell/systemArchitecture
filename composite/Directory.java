package composite;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystem item) {
        children.add(item);
    }

    public void remove(FileSystem item) {
        children.remove(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Directory: " + name);
        for (FileSystem item : children) {
            item.print(indent + "  ");
        }
    }
}
