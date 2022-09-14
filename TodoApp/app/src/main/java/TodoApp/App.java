package TodoApp;

import controller.ProjectController;
import java.util.List;
import model.Project;

public class App {
   

    public static void main(String[] args) {
     
//        ProjectController projectController = new ProjectController();
//        
//        Project project = new Project();
//        project.setName("Projeto Teste");
//        project.setDescription("description");
//        projectController.save(project);
        
        ProjectController projectController = new ProjectController();
                
        Project project = new Project();
        project.setId(4);
        project.setName("Novo Nome do Projeto");
        project.setDescription("description");
        
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.print("Total de Projetos = " + projects.size());
        
        projectController.removeById(5);
    }    
}
