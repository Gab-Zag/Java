class Chunnin extends Ninja implements Batalhar {
    public Chunnin(String nome, int idade, int chakra, int missoesCompletas) {
        super(nome, idade, chakra, missoesCompletas);
        jutsu = "Taijutsu";
    }

    @Override
    public void treinarJutsu() {
        chakra += 40;
        System.out.println(nome + " realizou um treinamento do seu jutsu e agora seu poder é " + chakra);
    }

    @Override
    public void lutar() {
        System.out.println("Está acontecendo uma luta");
        mostrarInfos();
    }

    @Override
    public void atacar() {
        System.out.println("Ataque fraco, sem chakra utilizado");
        mostrarInfos();
    }
}
