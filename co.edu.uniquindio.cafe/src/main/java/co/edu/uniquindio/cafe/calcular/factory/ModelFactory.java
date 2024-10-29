package co.edu.uniquindio.cafe.calcular.factory;

public class ModelFactory {

    private static ModelFactory modelFactory;

    public static ModelFactory getInstancia() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
}
