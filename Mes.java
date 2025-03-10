public enum Mes {
    //Construção
    JANEIRO(1, "jan", "janeiro"),
    FEVEREIRO(2, "fev", "fevereiro"),
    MARÇO(3, "mar", "março");
    
    //Atributos
    private int numMes;
    private String siglaMes;
    private String descricaoMes;

    //Métodos get

    public int getNumMes(){
        return this.numMes;
    }

    public String getSiglaMes(){
        return this.siglaMes;
    }

    public String getDescricaoMes(){
        return this.descricaoMes;
    }

    //Método construtor

    Mes(int numMes, String siglaMes, String descricaoMes){
        this.numMes = numMes;
        this.siglaMes = siglaMes;
        this.descricaoMes = descricaoMes;
    }

}
