import java.util.ArrayList;

public class Academia {
    ArrayList<Equipamentos> equipamentos = new ArrayList<>();

    public void adicionarEquipamento(Equipamentos equip){
        equipamentos.add(equip);
    }

    public void mostrarInformacoes(){
        System.out.println("===Informações da academia===");
        for(Equipamentos equipamentos1 : equipamentos){
            System.out.println("Nome: " + equipamentos1.getNome());
            System.out.println("Custo de Aquisição: " + equipamentos1.getCustoAquisicao());
            System.out.println("Status: " + equipamentos1.getStatus());
            System.out.println();
        }
    }

    public void mostrarEquipamentosEmMnutencao(){
        int totalEquipamentos = equipamentos.size();
        int equipamentosEmManutencao = 0;

        for (Equipamentos equipamentos1 : equipamentos){
            if (equipamentos1.getStatus().equalsIgnoreCase("Manutenção")){
                equipamentosEmManutencao++;
            }
        }
        double perecetagemManutencao = ((double) equipamentosEmManutencao) / totalEquipamentos * 100;

        System.out.println("===Equipamentos em Manutenção===");
        System.out.println("Quantidade: " + equipamentosEmManutencao);
        System.out.println("Porcentagem: " + perecetagemManutencao + "%");
    }

    public void mostrarEquipamentosMaiorCusto(){
        Equipamentos equipamentosMaiorCusto = null;
        for (Equipamentos equipamentos1 : equipamentos){
            if(equipamentosMaiorCusto == null || equipamentos1.getCustoAquisicao() > equipamentosMaiorCusto.getCustoAquisicao()){
                equipamentosMaiorCusto = equipamentos1;
            }

            System.out.println("===Equipamentos com Maior Custo===");
            System.out.println("Nome: " + equipamentosMaiorCusto.getNome());
            System.out.println("Custo de Aquisição: " + equipamentosMaiorCusto.getCustoAquisicao());
        }
    }

    public void mostrarEquipamentosMenorCusto(){
        Equipamentos equipamentosMenorCusto = null;
        for (Equipamentos equipamentos1 : equipamentos) {
            if (equipamentosMenorCusto == null || equipamentos1.getCustoAquisicao() < equipamentosMenorCusto.getCustoAquisicao()){
                equipamentosMenorCusto = equipamentos1;
            }

            System.out.println("===Equipamentos com Menor Custo===");
            System.out.println("Nome: " + equipamentosMenorCusto.getNome());
            System.out.println("Custo de Aquisição: " + equipamentosMenorCusto.getCustoAquisicao());
        }
    }
}
