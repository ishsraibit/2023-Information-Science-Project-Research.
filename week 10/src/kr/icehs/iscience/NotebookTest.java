package kr.icehs.iscience;

public class NotebookTest {
    public static void main(String[] args) {
        OldSamsungNotebook oldSamsungNotebook = new OldSamsungNotebook();
        NewAsusNotebook newAsusNotebook = new NewAsusNotebook();

        System.out.println(newAsusNotebook.shapeA());
        System.out.println(newAsusNotebook.shapeC());

        System.out.println("optical mouse connected to " +oldSamsungNotebook.shapeA());
    }
}
