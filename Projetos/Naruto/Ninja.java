abstract class Ninja {
    private static int numTotalNinjas = 0;
    protected String nome;
    protected int idade;
    protected int chakra;
    protected int missoesCompletas;
    protected String rank;
    protected String jutsu;

    public Ninja(String nome, int idade, int chakra, int missoesCompletas) {
        this.nome = nome;
        this.idade = idade;
        this.chakra = chakra;
        this.missoesCompletas = missoesCompletas;
        this.rank = "";
        this.jutsu = "";
        numTotalNinjas++;
    }

    public void classificar() {
        if (missoesCompletas >= 40) {
            rank = "S";
        } else if (missoesCompletas >= 21) {
            rank = "A";
        } else if (missoesCompletas >= 11) {
            rank = "B";
        } else if (missoesCompletas >= 2) {
            rank = "C";
        }
    }

    public abstract void treinarJutsu();

    public void treinarParaExame() {
        System.out.println("Treinando para o exame...");
        chakra += 1;
        mostrarInfos();
    }

    public void realizarMissao() {
        System.out.println(nome + " está realizando uma missão");
    }

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Chakra: " + chakra);
        System.out.println("Missões Completas: " + missoesCompletas);
        System.out.println("Rank: " + rank);
        System.out.println("Jutsu: " + jutsu);
    }

    public static int getNumTotalNinjas() {
        return numTotalNinjas;
    }

    public void atacar() {
    }

    public void lutar() {
    }
}
