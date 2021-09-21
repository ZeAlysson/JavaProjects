package classe;

public class valorVsReferencia {
    
    public static void main(String[] args) {
        
        double a = 2;
        double b = a;//atribuicao por referencia(objeto)

        System.out.println(a);
        System.out.println(++a);
        System.out.println(b);
        
        data d1 = new data(14, 9, 2021);
        data d2 = d1;

        d1.dia = 23;
        d2.mes = 10;
        d1.ano = 2022;

        System.out.println(d1.formatarData());
        System.out.println(d2.formatarData());
        
        voltarDataPadrao(d1);

        System.out.println(d1.formatarData());
        System.out.println(d2.formatarData());

    }

    static void voltarDataPadrao(data d) {

        d.dia = 01;
        d.mes = 01;
        d.ano = 1970;

    }

}
