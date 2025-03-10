public class TesteData{
    public static void main(String[] args){
        //Criação e instância de objeto da classe data
        Data data = new Data(10, Mes.FEVEREIRO, 2025);

        //Construção do objeto
        //data.dia = 42; obsoleto
        //data.ano = 2024; obsoleto
        //data.mes = 75; obsoleto
        //data.setDia(10); obsoleto
        //data.setMes(2); obsoleto
        //data.setAno(2025); obsoleto

        System.out.println("\n\t\t\t -- Data --\n");
        System.out.println("Data: " + data.imprimirData());

        //Criação e instância de outra data
        Data outraData = new Data();

        //Imprimir outra data
        System.out.println("\n\t\t\t -- Outra Data -- \n");
        System.out.println("Outra Data: " + outraData.imprimirData());

    }
}