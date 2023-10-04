class Gennin extends Ninja implements Treinamento {
    private String sensei;

    public Gennin(String nome, int idade, int chakra, int missoesCompletas, String sensei) {
        super(nome, idade, chakra, missoesCompletas);
        this.sensei = sensei;
        jutsu = "Kekkei-Genkai";
    }

    @Override
    public void treinarJutsu() {
        if (jutsu.equals("Kekkei-Genkai")) {
            chakra += 15;
            System.out.println(nome + " realizou um treinamento do seu jutsu e agora seu poder é " + chakra);
        } else if (jutsu.equals("Taijutsu")) {
            chakra += 5;
            System.out.println(nome + " realizou um treinamento do seu jutsu e agora seu poder é " + chakra);
        }
    }

    @Override
    public void treinarParaExame() {
        if (sensei.equals("Kakashi")) {
            System.out.println("O ninja é treinado pelo Kakashi, logo vai ter mais poder");
            chakra += 10;
        } else {
            System.out.println(nome + " está em treinamento");
        }
        mostrarInfos();
    }
}
