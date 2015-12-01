package de.greenrobot.android.dao.generator;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyDaoGenerator {

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1000, "org.maxwe.android.project.sample.dao");
        addCustomerEntity(schema);
        if (args == null){
            new DaoGenerator().generateAll(schema,"maxwe-android-sample/src/main/java");
        }else{
            new DaoGenerator().generateAll(schema,args[0] + "/maxwe-android-sample/src/main/java");
        }
    }

    private static void addCustomerEntity(Schema schema) {
        Entity customerEntity = schema.addEntity("CustomerEntity");
        customerEntity.addIdProperty().unique().primaryKey();
        customerEntity.addStringProperty("username");
        customerEntity.addStringProperty("password");
        customerEntity.addStringProperty("name");
        customerEntity.addIntProperty("age");
        customerEntity.addStringProperty("address");
        customerEntity.addDateProperty("birthday");
    }
}
