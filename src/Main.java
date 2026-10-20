import controller.TarefaController;
import model.entity.Tarefa;
import model.service.TarefaService;

void main() {

    TarefaService tarefaService =
            new TarefaService();
    TarefaController tarefaController =
            new TarefaController(tarefaService);
    tarefaController.criarTarefa();
}