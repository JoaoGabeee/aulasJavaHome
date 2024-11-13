package principal;

import carro.Carro;
import carro.CarroDAO;
import console.Console;

public class MenuCarro {

    private static final int CRIAR_CARRO = 1;
    private static final int ATUALIZAR_CARRO = 2;
    private static final int LISTAR_CARRO = 3;
    private static final int PESQUISAR_ID = 4;
    private static final int EXCLUIR_CARRO = 5;
    private static final int SAIR = 6;
    private Console console;
    private CarroDAO carroDAO;

    public MenuCarro() {
        console = new Console();
        carroDAO = new CarroDAO();
    }

    public void excluirCarro() {
        int id = console.readInt("Digite o ID do carro que deseja excluir");

        Carro carro = carroDAO.findById(id);

        if (carro == null) {

        }
    }

    private void mostrarMenu() {
        System.out.printf("[%d] Criar carro", CRIAR_CARRO);
        System.out.printf("[%d] Atualizar carro", ATUALIZAR_CARRO);
        System.out.printf("[%d] Listar carros", LISTAR_CARRO);
        System.out.printf("[%d] PEsquisar carro pelo ID", PESQUISAR_ID);
        System.out.printf("[%d] Excluir carro", EXCLUIR_CARRO);
        System.out.printf("[%d] Sair", SAIR);
    }

}
