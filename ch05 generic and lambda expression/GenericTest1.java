class GenericTest1 {
    public static void main(String[] args) {
        Data<String> data = new Data<>("hello");
        Integer i = 20;
        // data.set(i);
        String s = (String)data.get();
    }
}

/* non generic-type class
class Data {
    private Object object;
    public void set(Object object) {this.object = object;}
    public Object get() {return object;}
}
*/

/* generic-type class */
class Data<T extends Number> {
    private T t;
    Data(T t) {this.t = t;}
    public void set(T t) {this.t = t;}
    public T get() {return t;}
}