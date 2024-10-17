package produto;

import dao.GenericDAO;
import jakarta.persistence.Query;

import java.time.LocalDate;
import java.util.List;

public class ProdutoDAO extends GenericDAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }

    public List<Produto> gerarRelatorioFabricacao(LocalDate dataInicio, LocalDate dataFinal) {
        String sql = "from Produto p where p.dataFabricacao between :dataInicio and :dataFim";
        Query query = entityManager.createQuery(sql);
        query.setParameter(":dataIncio", dataInicio);
        query.setParameter(":dataFim", dataFinal);

        return query.getResultList();
    }
}