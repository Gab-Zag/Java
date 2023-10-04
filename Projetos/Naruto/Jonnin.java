class Jonnin extends Ninja implements Batalhar {
    private String habilidadeEspecial;

    public Jonnin(String nome, int idade, int chakra, int missoesCompletas, String habilidadeEspecial) {
        super(nome, idade, chakra, missoesCompletas);
        this.habilidadeEspecial = habilidadeEspecial;
        jutsu = "Kekkei-Genkai";
    }

    @Override
    public void treinarJutsu() {
        if (jutsu.equals("Kekkei-Genkai")) {
            chakra += 100;
        } else if (jutsu.equals("Taijutsu")) {
            chakra += 40;
        }
        System.out.println(nome + " realizou um treinamento do seu jutsu e agora seu poder é " + chakra);
    }

    @Override
    public void lutar() {
        System.out.println("Está acontecendo uma luta");
        mostrarInfos();
    }

    @Override
    public void atacar() {
        if (habilidadeEspecial.equals("Clones")) {
            chakra -= (0.05 * chakra);
        } else if (habilidadeEspecial.equals("Teletransporte")) {
            chakra -= (0.07 * chakra);
        }
        System.out.println(nome + " atacou com " + habilidadeEspecial);
        mostrarInfos();
    }
}
