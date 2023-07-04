package gadjeterium.service;

import gadjeterium.enums.Category;
import gadjeterium.model.Model;

import java.util.List;

public interface Service {
    public String addModel(Model model);

    List<Model> getAllModel();

    void getModelById(Long id);

    void deleteModelsById(Long id);

    Model searchById(Long id);

    Model categoryChoice(int category);

    Model sortByPrice();

    Model filter(Category category);
}
