package Aula0109.exercicios.e12;

public class EmpresaMain {
    public static void main(String[] args) {

        EmpresaService empresaService = new EmpresaService();

        Departamento ti = new Departamento("Tecnologia da Informação");
        ti.adicionarFuncionario(new Funcionario("Lucas"));
        ti.adicionarFuncionario(new Funcionario("Beatriz"));

        Departamento rh = new Departamento("Recursos Humanos");
        rh.adicionarFuncionario(new Funcionario("Fernando"));

        empresaService.adicionarDepartamento(ti);
        empresaService.adicionarDepartamento(rh);

        empresaService.listarEmpresa();
    }
}