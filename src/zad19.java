public class zad19 {
    public zad19() {
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());
        Box<Integer> box2 = new Box<>();
        box2.setItem(1231);
        System.out.println(box2.getItem());
    }
}

class Box<T>{
    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
