package composite;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("resume.pdf");
        File file2 = new File("cover_letter.docx");

        Folder document = new Folder("Documents");
        document.addComponent(file1);
        document.addComponent(file2);

        Folder mainFolder = new Folder("Home");
        mainFolder.addComponent(document);
        mainFolder.showDetails();
    }
}
