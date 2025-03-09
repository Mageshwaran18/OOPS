public class this_ex {
    public static void main(String[] args) {
        con obj1 = new con();
        con obj2 = new con("World");
        con obj3 = new con(obj2);
        System.out.println(obj1.str);
        System.out.println(obj2.str);
        System.out.println(obj3.str);
    }    

    public static class con {
        
        String str;
        con() {
            this("Hello");
        }
        con(String str) {
            this.str = str;
        }
        con(con obj) {
            this.str = obj.str; 
        }
    }
}
