import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    important ArrayList;

    public class Pais {

        private String codigoISO;
        private String nome;
        private long populacao;
        private double dimensao;
        private List<Pais> vizinhos;


        public Pais(String codigoISO, String nome, double dimensao) {
            this.codigoISO = codigoISO;
            this.nome = nome;
            this.dimensao = dimensao;
            this.vizinhos = new ArrayList<>();
        }


        public String getCodigoISO() {
            return codigoISO;
        }

        public void setCodigoISO(String codigoISO) {
            this.codigoISO = codigoISO;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public long getPopulacao() {
            return populacao;
        }

        public void setPopulacao(long populacao) {
            this.populacao = populacao;
        }

        public double getDimensao() {
            return dimensao;
        }

        public void setDimensao(double dimensao) {
            this.dimensao = dimensao;
        }

        public List<Pais> getVizinhos() {
            return vizinhos;
        }

        public void addVizinho(Pais pais) {
            if (!vizinhos.contains(pais)) {
                vizinhos.add(pais);
                pais.getVizinhos().add(this);


            }
        }


        public boolean isVizinho(Pais outroPais) {
            return vizinhos.contains(outroPais);
        }

        
        public double getDensidadePopulacional() {
            return (populacao / dimensao);
        }
        public List<Pais> getVizinhosComuns(Pais outroPais) {
            List<Pais> vizinhosComuns;
            vizinhosComuns = new ArrayList<>();
            for (Pais vizinho : vizinhos) {
                if (outroPais.getVizinhos().contains(vizinho)) {
                    boolean add;

                    if (outroPais.getVizinhos().contains(vizinho)) {
                        continue;
                    }
                    add = true;
                }
            }
            return vizinhosComuns;
        }

    }
}