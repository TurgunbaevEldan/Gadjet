package gadjeterium.db;

import gadjeterium.model.Model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    List<Model>models = new ArrayList<>();

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
