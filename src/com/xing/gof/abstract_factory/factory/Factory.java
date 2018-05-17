package com.xing.gof.abstract_factory.factory;

public abstract class Factory {

    public static Factory getFactory(String className){
        Factory factory = null;
        try {
            Class<?> clazz = Class.forName(className);
            factory = (Factory)clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String tile,String author);

}
