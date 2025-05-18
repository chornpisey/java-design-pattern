package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        this.children.add(component);
    }

    public void removeComponent(FileSystemComponent component){
        this.children.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent child : children) {
            child.showDetails();
        }
    }
}
