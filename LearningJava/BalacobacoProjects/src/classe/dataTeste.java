package classe;

public class dataTeste {

    public static void main(String[] args) {

        data data1 = new data(24, 05, 2002);
        // data1.dia = 12;
        // data1.mes = 07;
        // data1.ano = 2021;

        var data2 = new data();
        // data2.dia = 10;
        // data2.mes = 04;
        // data2.ano = 2020;

        String dataFormatada1 = data1.formatarData();
        String dataFormatada2 = data2.formatarData();

        System.out.println(dataFormatada1);
        System.out.println(dataFormatada2);
        

    }
}
