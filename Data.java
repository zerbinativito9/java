public class Data {
    //Atributos
    private int dia;
    private Mes mes;
    private int ano;

    //Métodos
    public String imprimirData(){
        return dia + "-" + mes.getNumMes() + "-" + ano + "\n";
    }

    private void setDia(int dia){
        if(dia > 0 && dia <= 31){
            switch(mes.getNumMes()){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    this.dia = dia;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(dia <= 30){
                        this.dia = dia;
                    } else {
                        this.dia = 1;
                    }
                    break;
                case 2:
                    if(dia <= 29 && (ano % 4 == 0)){
                        this.dia = dia;
                    } else if(dia <= 28){
                        this.dia = dia;
                    } else {
                        this.dia = 1;
                    }
                    break;
                default:
                    this.dia = 1;
            }
        } else {
            this.dia = 1;
        }

    }

    public int getDia(){
        return this.dia;
    }

    private void setMes(Mes mes){
        this.mes = mes;
    /* obsoleto
        if(mes.getNumMes() >= 1 && mes.getNumMes() <= 12){
            this.mes = mes;
        }else{
            this.mes = Mes.JANEIRO;
        }
    */
    }

    public Mes getMes(){
        return this.mes;
    }

    private void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    Data(int dia, Mes mes, int ano){
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
    }

    Data(){
        this.setAno(2025);
        this.setMes(Mes.JANEIRO);
        this.setDia(1);
    }

}
