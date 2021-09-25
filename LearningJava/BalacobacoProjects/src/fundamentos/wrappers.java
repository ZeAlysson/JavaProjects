package fundamentos;

public class wrappers {
    public static void main(String[] args) {
        
        Byte b = 100;
        Short s = 1000;
        Integer i = 100000000;
        Long l = 100000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/1000);

        //Float f = 123.5F;
        //Double d = 8134.23;

        Boolean bo = true;
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = 'D';
        System.out.println(""+ c);





    }
    
}
