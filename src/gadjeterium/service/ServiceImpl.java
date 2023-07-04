package gadjeterium.service;

import gadjeterium.db.DataBase;
import gadjeterium.enums.Category;
import gadjeterium.model.Model;

import java.util.Comparator;
import java.util.List;

public class ServiceImpl implements Service{
   private DataBase dataBase;

    public ServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }



    @Override
    public String addModel(Model model) {
        dataBase.getModels().add(model);
        return model+":  Добавлен";
    }

    @Override
    public List<Model> getAllModel() {
        return dataBase.getModels();
    }

    @Override
    public void getModelById(Long id) {
        for (int i = 0; i <dataBase.getModels().size() ; i++) {
            if (dataBase.getModels().get(i).getId() == id) {
                dataBase.getModels().get(i);
                System.out.println("Устройсвто найдено");
            }
        }
    }

    @Override
    public void deleteModelsById(Long id) {
        for (int i = 0; i <dataBase.getModels().size() ; i++) {
            if (dataBase.getModels().get(i).getId()==id){
                dataBase.getModels().remove(dataBase.getModels().get(i));
                System.out.println(dataBase.getModels()+"Успешно удалено");
            }
        }
    }

    @Override
    public Model searchById(Long id) {
        for (Model m:dataBase.getModels()) {
            if (m.getId().equals(id)){
                return m;
            }
        }
        return null;
    }

    @Override
    public Model categoryChoice(int category) {
        if (category==1){
            return (Model) dataBase.getModels().stream().
                    filter(model -> model.getCategory().equals(Category.PHONE)).toList();
        }
        else{
            return (Model) dataBase.getModels().stream().
                    filter(model -> model.getCategory().equals(Category.LAPTOP)).toList();
        }
    }

    @Override
    public Model sortByPrice() {
        List<Model>models = getAllModel();
        Model modelBek = models.stream().
                min(Comparator.comparingInt(Model::getPrice)).
                orElse(null);
        return modelBek;
    }

    @Override
    public Model filter(Category category) {
        List<Model>models = dataBase.getModels().stream().sorted(Comparator.comparingInt(Model::getPrice)).toList();
        Model model = new Model();
        for (Model m:models) {
            if (m.getCategory()== category){
                System.out.println(m);
            }
        }
        return model;
    }
}
