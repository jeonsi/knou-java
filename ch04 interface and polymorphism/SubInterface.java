public interface SubInterface extends SuperInterface, SuperInterface2 {
   public void func3(); 
}

interface SuperInterface {
    public void func1();
    public void func2();
}

interface SuperInterface2 {
    public void func4();
    public void func5();
}