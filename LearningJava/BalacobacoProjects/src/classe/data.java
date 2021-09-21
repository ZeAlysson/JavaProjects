package classe;

public class data {

    int dia;
    int mes;
    int ano;

    data ()
    {
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    data (int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatarData()
    {
        return String.format("%d/%d/%d", dia, mes, ano);
    }



}
