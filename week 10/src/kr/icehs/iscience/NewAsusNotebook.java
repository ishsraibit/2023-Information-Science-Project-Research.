package kr.icehs.iscience;

public class NewAsusNotebook extends Notebook implements UsbA, UsbC {
    @Override
    public String shapeC() {
        return "rounded shape interface";
    }

    @Override
    public String shapeA() {
        return "rectangle shape interface";
    }
}
