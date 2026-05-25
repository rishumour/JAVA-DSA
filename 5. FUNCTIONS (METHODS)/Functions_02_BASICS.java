public class Functions_02_BASICS{
    int a = 10;
    int b = 20;

    void add(int a){
        System.out.println(this.a); // here this keyword will point to the class variables previously initialized
    }
    void main(){
        add(6);
    }
}
